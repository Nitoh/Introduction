package Game;

import Base.BasicTools;
import Enums.eHorizontalDirection;
import Interfaces.IWordComparison;
import People.Player;
import Rooms.Floor;
import Rooms.MasterRoom;
import Rooms.Room;
import Text.GameTexts;

import java.util.ArrayList;
import java.util.Scanner;

public class School implements IWordComparison {

    private String name;
    private Player player;

    private Room startRoom;
    private Room currentRoom;

    private boolean isGameOver = false;

    private ArrayList<String> allowedWordsForHeadsOrTails = new ArrayList<>();
    private ArrayList<String> yesNoWords = new ArrayList<>();

    public School(String name) {
        this.name = name;

        startRoom = new Floor();
        currentRoom = startRoom;

        collectHeadsOrTailsWords();
        collectYesNoWords();
    }

    /**
     * starts the game in a while loop and ends it if the player is in the masterroom
     *
     * @param player
     */
    public void runGame(Player player) {
        this.player = player;

        System.out.println(GameTexts.getWelcomeSpeech() + " " + this.player.getName() + "!");
        System.out.println(GameTexts.getIntroductionSpeech());

        while (!isGameOver) {
            if (tryToAnswerRoomQuestion()) {
                moveToNextRoom();
            }

            // options if game is over
            tryToUsePlayerJokerWhenGameIsOver();
            checkIfMasterRoom();
            askIfPlayAgain();
        }
    }

    /**
     * @return isAnswerCorrect
     */
    private boolean tryToAnswerRoomQuestion() {
        boolean isAnswerCorrect = currentRoom.getRoomIntroductionAndQuestion();
        if (!isAnswerCorrect) {
            if (!(currentRoom.getClass() == MasterRoom.class)) {
                System.out.println(GameTexts.getGameOverSpeech());
            }
            isGameOver = true;
        }
        return isAnswerCorrect;
    }

    /**
     * player has to choose direction if it's possible
     */
    private void moveToNextRoom() {
        if (currentRoom.hasChoice()) {
            System.out.println(GameTexts.getMultipleDoorSpeech());

            eHorizontalDirection playerChoice = player.chooseDoor();
            if (playerChoice == eHorizontalDirection.Left) {
                currentRoom = currentRoom.getLeftRoom();
            } else if (playerChoice == eHorizontalDirection.Right) {
                currentRoom = currentRoom.getRightRoom();
            }
        } else {
            System.out.println(GameTexts.getJustOneDoorSpeech());
            currentRoom = currentRoom.getExistingRoom();
        }

    }

    /**
     * checks if the current room is the masterroom
     */
    private void checkIfMasterRoom() {
        if (currentRoom.getName().equalsIgnoreCase(MasterRoom.class.getSimpleName())) {
            currentRoom.getRoomIntroductionAndQuestion();
            System.out.println(GameTexts.getCongratulationSpeech() + " " + player.getName() + ", " + GameTexts.getGameFinishedSpeech());
            isGameOver = true;
        }
    }

    /**
     * Player has one chance to continue the game with a heads or tails joker
     */
    private void tryToUsePlayerJokerWhenGameIsOver() {
        if (isGameOver && player.hasJoker()) {
            System.out.println(GameTexts.getGameOverUseJokerSpeech());

            // Wait for correct answer
            String headsOrTails = BasicTools.getKeyboardInput();
            while (!compareStringsIgnoreCase(allowedWordsForHeadsOrTails, headsOrTails)) {
                System.out.println(GameTexts.getWrongInputPleaseRepeatSpeech());
                headsOrTails = BasicTools.getKeyboardInput();
            }

            // hope for the best..
            player.useJokerAndSetIntoToken();
            if (compareFirstCharacterOfStringsIgnoreCase(headsOrTails, player.getToken())) {
                System.out.println("Und das richtige Ergebnis lautet.. " + headsOrTails + " !\nDu darfst weiterspielen!");
                isGameOver = false;
            } else {
                System.out.println("Das war leider die falsche Wahl..");
                isGameOver = true;
            }
        }
    }

    /**
     * Asks the player to play again if game is over before the while loop ends
     */
    private void askIfPlayAgain() {
        if (isGameOver) {
            System.out.println(GameTexts.getRestartGameSpeech());
            GameTexts.getYesNoSpeech();
            Scanner scanner = new Scanner(System.in);
            String decision = scanner.nextLine();
            if (compareStringsIgnoreCase("j", decision) || compareStringsIgnoreCase("ja", decision)) {
                refreshGame();
            } else {
                System.out.println("Bis zum nächsten mal!");
            }
        }
    }

    /**
     * reset the fields to defauls values
     */
    private void refreshGame() {
        startRoom = new Floor();
        currentRoom = startRoom;

        System.out.println("Das Spiel wird neu gestartet!");
        isGameOver = false;
        this.player.refreshItems();
        runGame(this.player);
    }

    /**
     * these words are allowed at the joker game
     */
    private void collectHeadsOrTailsWords() {
        allowedWordsForHeadsOrTails.add("k");
        allowedWordsForHeadsOrTails.add("z");
        allowedWordsForHeadsOrTails.add("Kopf");
        allowedWordsForHeadsOrTails.add("Zahl");
    }

    /**
     * these words are allowed in yes no questions
     */
    private void collectYesNoWords() {
        yesNoWords.add("j");
        yesNoWords.add("n");
        yesNoWords.add("ja");
        yesNoWords.add("nein");
    }

}
