
public class StringUtilities {
    public String returnInput(String input) {
        return input;
    }

    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    public String reverse(String valueToBeReversed) {
        String result = "";
        for (int i = valueToBeReversed.length() - 1; i >= 0; i--) {
            result += valueToBeReversed.charAt(i);
        }
        return result;
    }

    public Character getMiddleCharacter(String word) {
        Character result = ' ';
        result = word.charAt((word.length()-1)/2);
        return result;
    }

    public String removeCharacter(String value, Character charToRemove) {
        String result = "";
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) != charToRemove){
                result += value.charAt(i);
            }
        }
        return result;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentenceasdfadsf
     */
    public String getLastWord(String sentence) {
        return null;
    }
}
