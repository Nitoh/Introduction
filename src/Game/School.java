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

    ArrayList<String> allowedWordsForHeadsOrTails = new ArrayList<>();
    ArrayList<String> yesNoWords = new ArrayList<>();

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
     * @param student
     */
    public void startGameWithPlayer(Player student) {
        this.player = student;

        System.out.println(GameTexts.getWelcomeSpeech() + " " + player.getName() + "!");
        System.out.println(GameTexts.getIntroductionSpeech());

        while (!isGameOver) {
            if (!getRoomQuestion()) {
                walkToNextRoom();
            }

            tryToUsePlayerJokerWhenGameIsOver();

            checkIfMasterRoom();

            askIfPlayAgain();
        }
    }

    private boolean getRoomQuestion() {
        if (!currentRoom.getRoomIntroductionAndQuestion()) {
            if (!(currentRoom.getClass() == MasterRoom.class)) {
                System.out.println(GameTexts.getGameOverSpeech());
            }
            isGameOver = true;
        }
        return isGameOver;
    }

    /**
     * player has to choose direction if it's possible
     */
    public void walkToNextRoom() {
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
            player.useJoker();
            if (compareFirstCharacterOfStringsIgnoreCase(headsOrTails, player.getToken())) {
                System.out.println("Und das richtige Ergebnis lautet.. " + headsOrTails + " !\nDu darfst weiterspielen!");
                isGameOver = false;
            } else {
                System.out.println("Das war leider die falsche Wahl..");
                isGameOver = true;
            }
        }
    }

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

    private void refreshGame() {
        startRoom = new Floor();
        currentRoom = startRoom;

        System.out.println("Das Spiel wird neu gestartet!");
        isGameOver = false;
        startGameWithPlayer(player);
        player.refreshItems();
    }

    private void collectHeadsOrTailsWords() {
        allowedWordsForHeadsOrTails.add("k");
        allowedWordsForHeadsOrTails.add("z");
        allowedWordsForHeadsOrTails.add("Kopf");
        allowedWordsForHeadsOrTails.add("Zahl");
    }

    private void collectYesNoWords() {
        yesNoWords.add("j");
        yesNoWords.add("n");
        yesNoWords.add("ja");
        yesNoWords.add("nein");
    }

}
