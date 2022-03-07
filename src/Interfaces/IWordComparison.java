package Interfaces;

import java.util.ArrayList;

public interface IWordComparison {

    public default boolean compareCharacters(char expectedKey, char inputKey) {
        if (expectedKey == inputKey) return true;
        return false;
    }

    public default boolean compareCharactersIgnoreCase(char expectedKey, char inputKey) {
        if (expectedKey == Character.toUpperCase(inputKey) || expectedKey == Character.toLowerCase(inputKey))
            return true;
        return false;
    }

    public default boolean compareStrings(String expectedInput, String inputKey) {
        if (expectedInput.equals(inputKey)) return true;
        return false;
    }

    public default boolean compareStringsIgnoreCase(String expectedInput, String inputKey) {
        if (expectedInput.equalsIgnoreCase(inputKey)) return true;
        return false;
    }

    public default boolean compareStringsIgnoreCase(ArrayList<String> expectedInputs, String inputKey) {
        for (String word : expectedInputs) {
            if (compareStringsIgnoreCase(word, inputKey)) return true;
        }
        return false;
    }

    public default boolean compareFirstCharacterOfStringsIgnoreCase(String expectedInput, String inputKey) {
        if (compareCharactersIgnoreCase(Character.toLowerCase(expectedInput.charAt(0)), Character.toLowerCase(inputKey.charAt(0))))
            return true;
        return false;
    }

}
