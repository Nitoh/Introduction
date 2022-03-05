package Questions;

import Enums.eYesNo;
import Interfaces.Input.ICheckConsoleInput;

public abstract class YesNoQuestion implements ICheckConsoleInput {

    protected String question;
    protected eYesNo correctAnswer;
    protected eYesNo selectedAnswer;

    private boolean isAnswerCorrect = false;

    public YesNoQuestion() {
//        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public boolean askQuestion() {
        System.out.println(question);
        System.out.println("Auswahlmöglichkeiten: J(Ja) oder N(Nein)");
        String input = scanner.nextLine();

        if (compareInputsIgnoreCase("J", input)) {
            selectedAnswer = eYesNo.Ja;
        } else if (compareInputsIgnoreCase("N", input))
            selectedAnswer = eYesNo.Nein;
        else {
            System.out.println("Falsche Eingabe..Das Spiel wird beendet.");
            return false;
        }

        if (this.correctAnswer == selectedAnswer) {
            System.out.println("Korrekte Antwort!");
            isAnswerCorrect = true;
        }
        else{
            System.out.println("Falsche Antwort..");
        }

        return isAnswerCorrect;
    }
}
