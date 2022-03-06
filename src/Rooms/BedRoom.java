package Rooms;

import Buildings.Room;
import Enums.eLeftRight;
import Questions.GermanReunionQuestion;
import Questions.HyenaQuestion;
import Buildings.Door;

public class BedRoom extends Room {

    public BedRoom() {

        this.leftDoor = new Door(new HyenaQuestion());
        this.rightDoor = new Door(new GermanReunionQuestion());
        this.name = "Flur";
    }

}
