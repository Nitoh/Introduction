package Questions;

import Text.GameTexts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Question {

    protected String question;
    protected String optionOne;
    protected String optionTwo;

    protected Character correctAnswer;
    protected Character selectedAnswer;

    protected boolean isFunQuestion = false;
    private boolean isAnswerCorrect = false;

    private List<Character> allowedAnswers = new ArrayList<Character>();

    public Question() {
        allowedAnswers.add('A');
        allowedAnswers.add('B');
    }

    public boolean askQuestion() {
        getQuestionWithAnswerPossibilities();

        Scanner scanner = new Scanner(System.in);
        String input = new String(scanner.nextLine());

        while (!input.equalsIgnoreCase("a") && !input.equalsIgnoreCase("b")) {
            System.out.println(GameTexts.getWrongInputPleaseABSpeech());
            input = scanner.nextLine();
        }

        selectedAnswer = input.charAt(0);

        if (isFunQuestion) return false;

        if (Character.toLowerCase(selectedAnswer) == Character.toLowerCase(correctAnswer)) {
            System.out.println(GameTexts.getCorrectAnswerSpeech());
            isAnswerCorrect = true;
        } else {
            System.out.println(GameTexts.getWrongAnswerSpeech());
        }
        return isAnswerCorrect;
    }

    /**
     * Reads the question and the possible answers
     */
    private void getQuestionWithAnswerPossibilities() {
        System.out.println(question);
        System.out.println(GameTexts.getAskForAnsweringSpeech());
        System.out.println("A: " + optionOne + "\n" + "B: " + optionTwo);
    }
}
