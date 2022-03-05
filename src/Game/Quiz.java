package Game;

import Enums.eYesNo;

public class Quiz {

    private final String question;
    private final eYesNo answerPossibilityOne;
    private final eYesNo answerPossibilityTwo;
    private final eYesNo correctAnswer;

    public Quiz(String question, eYesNo correctAnswer, eYesNo answerPossibilityOne, eYesNo answerPossibilityTwo) {
        this.question = question;
        this.correctAnswer = correctAnswer;

        this.answerPossibilityOne = answerPossibilityOne;
        this.answerPossibilityTwo = answerPossibilityTwo;
    }

    public boolean checkPlayerAnswer(eYesNo selectedAnswer) {
        return selectedAnswer == this.correctAnswer;
    }
}
