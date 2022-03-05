package People;

import Enums.eLeftRight;

import java.io.Console;
import java.util.Scanner;

public class Student extends Human {

    public Student(String name, int age) {
        super(name, age);
    }

    public eLeftRight chooseDoor() {
        System.out.println("Welche Türe möchtest du wählen?\nBitte L für Links oder R für rechts eingeben\n");

        Scanner scanner = new Scanner(System.in);

        if (scanner.nextLine() == "L" || scanner.nextLine() == "l") return eLeftRight.Left;
        if (scanner.nextLine() == "R" || scanner.nextLine() == "r") return eLeftRight.Right;

        else {
            System.out.println("Falsche Eingabe!\nBitte erneut eingeben.");
            chooseDoor();
        }

        return eLeftRight.Left;
    }
}
