package com.example.introduction;

import Base.TextFileReader;
import Buildings.School;
import People.Student;
import Rooms.Floor;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {

        Student student = new Student("Serhat", 26);
//        student.chooseDoor();

        School school = new School("Die Schule der ganz schlauen");
        school.startGameWithPlayer(student);
        school.walkToNextRoom();

//        Floor floor = new Floor();
//        floor.tryToOpenDoor(student.getStudentDirection());
    }

    private static void doFileLogic() throws IOException {
        TextFileReader.openFileDialog();
        System.out.println(TextFileReader.getFileContent());
    }
}
