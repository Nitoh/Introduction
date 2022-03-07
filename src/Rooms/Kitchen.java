package Rooms;

import Questions.*;

public class Kitchen extends Room {

    public Kitchen() {
        this.name = "Küche";
        this.question = new PopulationQuestion();
        this.leftRoom = null;
        this.rightRoom = new LivingRoom();
    }
}
