import java.util.HashMap;
import java.util.Map;

public class MaximumOccuringChar {
    public static Map<Character, Integer> findMaxCharacterCount(String str) {
        Map<Character, Integer> countMap = new HashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        // Find the character with the maximum count
        char maxChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        Map<Character, Integer> result = new HashMap<>();
        result.put(maxChar, maxCount);
        return result;
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";

        // Call the function and print the result
        Map<Character, Integer> result = findMaxCharacterCount(str);
        System.out.println("Character: " + result.keySet().iterator().next() + ", Count: " + result.values().iterator().next());
    }
}

