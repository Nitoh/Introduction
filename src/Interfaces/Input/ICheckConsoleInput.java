package Interfaces.Input;

public interface ICheckConsoleInput extends IReadConsoleInput {

    public default boolean compareKeys(char expectedKey, char inputKey) {
        if (expectedKey == inputKey) return true;
        return false;
    }

    public default boolean compareKeysIgnoreCase(char expectedKey, char inputKey) {
        if (expectedKey == Character.toUpperCase(inputKey) || expectedKey == Character.toLowerCase(inputKey))
            return true;
        return false;
    }

    public default boolean compareInputs(String expectedInput, String inputKey) {
        if (expectedInput.equals(inputKey)) return true;
        return false;
    }

    public default boolean compareInputsIgnoreCase(String expectedInput, String inputKey) {
        if (expectedInput.equalsIgnoreCase(inputKey)) return true;
        return false;
    }

}
