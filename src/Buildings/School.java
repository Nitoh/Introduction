package Buildings;

import People.Student;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private Student player;

    private List<Room> leftRooms;
    private List<Room> rightRooms;

    public School(String name) {
        this.name = name;

        leftRooms = new ArrayList<>();
        rightRooms = new ArrayList<>();
    }

    public void startGameWithPlayer(Student student) {
        this.player = student;
        System.out.println("Herzlich Willkommen" + player.getName());
    }

    public void walkToNextRoom() {
        System.out.println("");
    }

}
