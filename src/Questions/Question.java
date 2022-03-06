package Questions;

import Interfaces.Input.ICheckConsoleInput;

import java.util.ArrayList;
import java.util.List;

public abstract class Question implements ICheckConsoleInput {

    protected String question;
    protected String optionOne;
    protected String optionTwo;

    protected Character correctAnswer;
    protected Character selectedAnswer;

    private boolean isAnswerCorrect = false;

    private List<Character> allowedAnswers = new ArrayList<Character>();

    public Question() {
        allowedAnswers.add('A');
        allowedAnswers.add('B');
    }

    public boolean askQuestion() {
        getQuestionWithAnswerPossibilities();

        String input = new String(readAnswer());
        selectedAnswer = input.charAt(0);

        if (Character.toLowerCase(selectedAnswer) == Character.toLowerCase(correctAnswer)) {
            System.out.println("Korrekte Antwort!");
            isAnswerCorrect = true;
        } else {
            System.out.println("Falsche Antwort..");
        }
        return isAnswerCorrect;
    }

    private void getQuestionWithAnswerPossibilities() {
        System.out.println(question);
        System.out.println("Welche Antwort ist richtig?");
        System.out.println("A: " + optionOne + " oder " + "B: " + optionTwo);
    }

    private String readAnswer() {
        String answer = new String(scanner.nextLine());

        if (allowedAnswers.contains(answer.toUpperCase().charAt(0)) ||
                allowedAnswers.contains(answer.toLowerCase().charAt(0))) {
            return answer;
        } else {
            System.out.println("Falsche Eingabe! Bitte zwischen A oder B entscheiden!");
            readAnswer();
        }
        return answer;
    }
}
