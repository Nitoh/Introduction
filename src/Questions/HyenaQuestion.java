package Questions;

import Enums.eYesNo;

public class HyenaQuestion extends YesNoQuestion {

    public HyenaQuestion() {
        this.question = "Du bist auf die Hyänentüre gestoßen und das wird ganz böse enden!!\n" +
                "Deine Frage lautet: Sind Hyänen Hundetiere?";
        this.correctAnswer = eYesNo.Nein;
    }
}
