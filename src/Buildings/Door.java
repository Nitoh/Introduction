package Buildings;

import Enums.eYesNo;
import Game.Quiz;

public class Door {
    public final Quiz quiz;

    public Door(Quiz quiz) {
        this.quiz = quiz;
//        quiz = new Quiz("Gehören Hyänen zu den Hundetieren?",eYesNo.Ja,eYesNo.Ja,eYesNo.Nein);
    }
}
