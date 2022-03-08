package People;

import Base.BasicTools;
import Enums.eHorizontalDirection;
import Text.GameTexts;

import java.util.Random;

public class Player extends Human {

    private eHorizontalDirection direction;
    private boolean hasJoker = true;

    private String token = "";

    public Player(String name, int age) {
        super(name, age);
    }

    public String getToken() {
        return token;
    }

    public void refreshItems() {
        hasJoker = true;
        token = "";
    }

    /**
     * returns the direction of the player
     *
     * @return
     */
    public eHorizontalDirection chooseDoor() {
//        Scanner scanner = new Scanner(System.in);
//        String input = new String(scanner.nextLine());

        String input = new String(BasicTools.getKeyboardInput());

        if (input.equalsIgnoreCase("L")) direction = eHorizontalDirection.Left;
        else if (input.equalsIgnoreCase("R")) direction = eHorizontalDirection.Right;
        else {
            System.out.println(GameTexts.getWrongInputPleaseRepeatSpeech());
            chooseDoor();
        }
        return direction;
    }

    public boolean hasJoker() {
        return hasJoker;
    }

    public void useJokerAndSetIntoToken() {
        Random random = new Random();
        int number = random.nextInt(2 + 1) + 1;
        if (number == 1) token = "Kopf";
        else token = "Zahl";
        hasJoker = false;
    }
}
