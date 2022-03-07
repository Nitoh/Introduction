package Text;

public class GameTexts {

    private static String welcomeSpeech = "Herzlich willkommen";

    private static String introductionSpeech = "Einleitung: \nDu befindest dich im Quizhaus. " + "In jedem Raum gibt es ein bis zwei Türen." + " \nUm durch eine Türe zu kommen, musst du die Frage richtig beantworten, ansonsten war es das" + " für dich.. Viel Erfolg!\n";

    private static String multipleDoorSpeech = "Du darfst dich zwischen zwei Türen entscheiden.\n" + "Welche Türe möchtest du wählen?\nBitte L für Links oder R für rechts eingeben";

    private static String justOneDoorSpeech = "In diesem Raum scheint es nur einen Ausweg zu geben.. Dieser wird automatisch" + " genommen.";

    private static String gameOverSpeech = "Das Spiel wird beendet.";

    private static String congratulationSpeech = "Herzlichen Glückwunsch";

    private static String gameFinishedSpeech = "du hast das Spiel vollendet!\nBis zum nächsten Mal!";

    private static String roomIntroductionSpeech = "Du bist jetzt im folgenden Raum: ";

    private static String correctAnswerSpeech = "Korrekte Antwort!";

    private static String wrongAnswerSpeech = "Falsche Antwort..";

    private static String wrongInputPleaseABSpeech = "Falsche Eingabe! Bitte zwischen A oder B entscheiden!";

    private static String askForAnsweringSpeech = "Welche Antwort ist richtig?";

    private static String wrongInputPleaseRepeatSpeech = "Falsche Eingabe!\nBitte erneut eingeben.";

    private static String gameOverUseJokerSpeech = "Du hast das Spiel verloren.. Halt! Du hast noch einen Joker! Kopf oder Zahl?\nSchreibe K oder Kopf bzw. Z oder Zahl!";

    private static String restartGameSpeech = "Das Spiel ist jetzt vorbei..\nMöchtest du erneut spielen?";

    private static String yesNoSpeech = "Schreibe J oder Ja bzw N oder Nein";


    public static String getWelcomeSpeech() {
        return welcomeSpeech;
    }

    public static String getIntroductionSpeech() {
        return introductionSpeech;
    }

    public static String getMultipleDoorSpeech() {
        return multipleDoorSpeech;
    }

    public static String getJustOneDoorSpeech() {
        return justOneDoorSpeech;
    }

    public static String getGameOverSpeech() {
        return gameOverSpeech;
    }

    public static String getCongratulationSpeech() {
        return congratulationSpeech;
    }

    public static String getGameFinishedSpeech() {
        return gameFinishedSpeech;
    }

    public static String getRoomIntroductionSpeech() {
        return roomIntroductionSpeech;
    }

    public static String getCorrectAnswerSpeech() {
        return correctAnswerSpeech;
    }

    public static String getWrongAnswerSpeech() {
        return wrongAnswerSpeech;
    }

    public static String getWrongInputPleaseABSpeech() {
        return wrongInputPleaseABSpeech;
    }

    public static String getAskForAnsweringSpeech() {
        return askForAnsweringSpeech;
    }

    public static String getWrongInputPleaseRepeatSpeech() {
        return wrongInputPleaseRepeatSpeech;
    }

    public static String getGameOverUseJokerSpeech() {
        return gameOverUseJokerSpeech;
    }

    public static String getRestartGameSpeech() {
        return restartGameSpeech;
    }

    public static String getYesNoSpeech() {
        return yesNoSpeech;
    }
}
