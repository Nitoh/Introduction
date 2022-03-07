package Rooms;

import Questions.FunQuestion;

public class MasterRoom extends Room {
    public MasterRoom() {
        this.name = "Masterroom";
        this.question = new FunQuestion();
        this.leftRoom = null;
        this.rightRoom = null;
    }
}
