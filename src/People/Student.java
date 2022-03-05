package People;

import Enums.eLeftRight;

import java.io.Console;
import java.util.Scanner;

public class Student extends Human {

    public Student(String name, int age) {
        super(name, age);
    }

    public eLeftRight chooseDoor() {
        System.out.println("Welche Türe möchtest du wählen?\nBitte L für Links oder R für rechts eingeben");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("L")) return eLeftRight.Left;
        if (input.equalsIgnoreCase("R")) return eLeftRight.Right;

        else {
            System.out.println("Falsche Eingabe!\nBitte erneut eingeben.");
            chooseDoor();
        }

        return eLeftRight.Left;
    }
}
