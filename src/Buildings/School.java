package Buildings;

import Enums.eLeftRight;
import People.Student;
import Rooms.BedRoom;
import Rooms.Floor;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private Student player;
    private ArrayList<Room> rooms = new ArrayList<>();
    private Room startRoom;
    private Room currentRoom;

    public School(String name) {
        this.name = name;

        startRoom = new Floor();
        currentRoom = startRoom;

//        rooms.add(new Floor());
        rooms.add(new BedRoom());
    }

    public void startGameWithPlayer(Student student) {
        this.player = student;
        System.out.println("Herzlich Willkommen" + player.getName());
        System.out.println("Du befindest dich im Quizhaus. In jedem Raum hast du die Wahl zwischen zwei Türen." +
                " \nUm durch eine Türe zu kommen, musst du die Frage richtig beantworten, ansonsten war es das" +
                " für dich.. Viel Erfolg!");
    }

    public void walkToNextRoom() {
        System.out.println("Welche Türe möchtest du wählen?\nBitte L für Links oder R für rechts eingeben");

        if(player.chooseDoor() == eLeftRight.Left){
            currentRoom = currentRoom.roomBehindLeftDoor;
        }
        else if(player.chooseDoor() == eLeftRight.Right){
            currentRoom = currentRoom.roomBehindRightDoor;
        }
    }

}
