package Rooms;

import Questions.*;

public class Floor extends Room {

    public Floor() {
        this.name = "Flur";
        this.question = new HyenaQuestion();
        this.leftRoom = new Kitchen();
        this.rightRoom = new BedRoom();
    }

}
