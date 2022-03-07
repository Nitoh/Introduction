package Rooms;

import Questions.UsainBoltQuestion;

public class ChildrensRoom extends Room {
    public ChildrensRoom() {
        this.name = "Kinderzimmer";
        this.question = new UsainBoltQuestion();
        this.leftRoom = new MasterRoom();
        this.rightRoom = null;
    }
}
