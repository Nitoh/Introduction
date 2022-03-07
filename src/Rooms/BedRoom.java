package Rooms;

import Questions.MiddleAgesQuestion;

public class BedRoom extends Room {

    public BedRoom() {
        this.name = "Schlafzimmer";
        this.question = new MiddleAgesQuestion();
        this.leftRoom = new LivingRoom();
        this.rightRoom = null;
    }

}
