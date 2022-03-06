package Rooms;

import Buildings.Door;
import Buildings.Room;
import Enums.eLeftRight;
import Questions.GermanReunionQuestion;
import Questions.HyenaQuestion;

public class Floor extends Room {

    public Floor() {
        this.leftDoor = new Door(new HyenaQuestion());
        this.rightDoor = new Door(new GermanReunionQuestion());

        this.roomBehindLeftDoor = new Kitchen();
        this.roomBehindRightDoor = new BedRoom();

        this.name = "Flur";
    }

}
