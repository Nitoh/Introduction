package Buildings;

import People.Student;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private Student player;

    private List<Room> leftRooms;
    private List<Room> rightRooms;

//    private Question hyenaQuestion = new Question("Sind Hyänen Hundetiere?", eYesNo.Nein);

//    private Door floorDoorLeft= new Door();

//    private Room floor = new Room("Flur", )

    public School(String name) {
        this.name = name;

        leftRooms = new ArrayList<>();
        rightRooms = new ArrayList<>();
    }

    public void startGameWithPlayer(Student student) {
        this.player = student;
        System.out.println("Herzlich Willkommen" + player.getName());
    }

    public void getNextRoom() {

    }

    private void createRooms() {
//        rooms.add();
    }

}
