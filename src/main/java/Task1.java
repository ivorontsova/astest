import java.util.HashMap;
import java.util.Map;

class Task1 {

    static int longestStringWithoutRepeating(String input) {
        if (null == input) {
            return 0;
        }

        int inputLength = input.length();
        if (inputLength <= 1) {
            return inputLength;
        }

        int gapLengthMax = 1;

        Map<Character, Integer> usedChars = new HashMap<>();

        for (int idx = 0; idx < inputLength; idx++) {
            char currChar = input.charAt(idx);
            if (usedChars.containsKey(currChar)) {
                gapLengthMax = Math.max(gapLengthMax, idx - usedChars.get(currChar));
            }
            usedChars.put(currChar, idx);
        }

        boolean allUnique = usedChars.size() == inputLength;
        return allUnique ? inputLength: gapLengthMax;
    }
}
