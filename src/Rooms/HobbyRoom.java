package Rooms;

import Questions.AirplaneQuestion;

public class HobbyRoom extends Room {
    public HobbyRoom() {
        this.name = "Hobbyraum";
        this.question = new AirplaneQuestion();
        this.leftRoom = null;
        this.rightRoom = new MasterRoom();
    }
}
