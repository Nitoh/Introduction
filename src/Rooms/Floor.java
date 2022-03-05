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
        this.name = "Flur";
    }

    public boolean tryToOpenDoor(eLeftRight direction) {
        if (direction == eLeftRight.Left) {
            this.leftDoor.open();
            return true;
        }
        if (direction == eLeftRight.Right) {
            this.rightDoor.open();
            return true;
        }
        return false;
    }
}
