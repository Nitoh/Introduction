package Buildings;

import Questions.YesNoQuestion;

public class Door {
    public final YesNoQuestion quiz;

    public Door(YesNoQuestion quiz) {
        this.quiz = quiz;
    }

    public void open(){
        this.quiz.askQuestion();
    }
}
