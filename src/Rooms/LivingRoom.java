package Rooms;

import Questions.GermanReunionQuestion;

public class LivingRoom extends Room {

    public LivingRoom() {
        this.name = "Schlafzimmer";
        this.question = new GermanReunionQuestion();
        this.leftRoom = new HobbyRoom();
        this.rightRoom = new ChildrensRoom();
    }
}
