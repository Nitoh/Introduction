package Buildings;

import Questions.Question;

public class Door {
    public final Question quiz;

    public Door(Question quiz) {
        this.quiz = quiz;
    }

    public void open(){
        this.quiz.askQuestion();
    }
}
