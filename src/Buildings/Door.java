package Buildings;

import Questions.YesNoQuestion;

public class Door {
    public final YesNoQuestion quiz;

    public Door(YesNoQuestion quiz) {
        this.quiz = quiz;
//        quiz = new Quiz("Gehören Hyänen zu den Hundetieren?",eYesNo.Ja,eYesNo.Ja,eYesNo.Nein);
    }
}
