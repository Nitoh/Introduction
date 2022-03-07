package com.example.introduction;

import Base.TextFileReader;
import Game.School;
import People.Player;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws IOException {

        System.out.println("Hallo. Bevor wir das Spiel beginnen brauche ich deinen Namen.\nWie heißt du?");
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();

        Player student = new Player(studentName, 26);
//        student.chooseDoor();

        School school = new School("Die Schule der ganz schlauen..");
        school.startGameWithPlayer(student);
    }

    private static void doFileLogic() throws IOException {
        TextFileReader.openFileDialog();
        System.out.println(TextFileReader.getFileContent());
    }
}
