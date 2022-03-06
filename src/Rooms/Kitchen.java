package Rooms;

import Buildings.Door;
import Buildings.Room;
import Questions.GermanReunionQuestion;
import Questions.HyenaQuestion;
import Questions.MiddleAgesQuestion;
import Questions.PopulationQuestion;

public class Kitchen extends Room {
    public Kitchen(){
        this.leftDoor = new Door(new PopulationQuestion());
        this.rightDoor = new Door(new MiddleAgesQuestion());

//        this.roomBehindLeftDoor = new

        this.name = "Küche";
    }
}
