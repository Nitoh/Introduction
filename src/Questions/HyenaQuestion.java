package Questions;

import Enums.eYesNo;

public class HyenaQuestion extends Question {

    public HyenaQuestion() {
        this.question = "Du bist auf die Hyänentüre gestoßen und das wird ganz böse enden!!\n" +
                "Deine Frage lautet: Zu welcher Gattung gehören Hyänen?";

        this.optionOne = "Hundetiere";
        this.optionTwo = "Katzentiere";

        this.correctAnswer = 'B';
    }
}
