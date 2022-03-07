package Rooms;

import Questions.Question;
import Text.GameTexts;

public abstract class Room {

    protected String name;
    protected Question question;

    protected Room leftRoom;
    protected Room rightRoom;

    public Room() {

    }

    public String getName() {
        return this.name;
    }

    public Room getLeftRoom() {
        return leftRoom;
    }

    public Room getRightRoom() {
        return rightRoom;
    }

    /**
     * returns the name and asks the assigned question
     */
    public boolean getRoomIntroductionAndQuestion() {
        System.out.println(GameTexts.getRoomIntroductionSpeech() + this.getName());
        return question.askQuestion();
    }

    /**
     * returns true if current room has left and right room
     *
     * @return
     */
    public boolean hasChoice() {
        if (this.leftRoom != null && this.rightRoom != null) return true;
        return false;
    }

    /**
     * returns the room which isn't null
     *
     * @return
     */
    public Room getExistingRoom() {
        if (this.leftRoom != null) return this.leftRoom;
        else if (this.rightRoom != null) return this.rightRoom;
        else return null;
    }

}
