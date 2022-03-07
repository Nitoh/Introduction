package Base;

import java.util.Scanner;

public class BasicTools {

    private static Scanner scanner = new Scanner(System.in);

    public static String getKeyboardInput() {
        return scanner.nextLine();
    }
}
