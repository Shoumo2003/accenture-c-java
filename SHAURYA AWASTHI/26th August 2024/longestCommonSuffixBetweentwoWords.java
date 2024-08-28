import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class longestCommonSuffixBetweentwoWords {
    public static int longestCommonSuffix(String word1, String word2) {
        int i = word1.length() - 1, j = word2.length() - 1, length = 0;

        while (i >= 0 && j >= 0 && word1.charAt(i) == word2.charAt(j)) {
           length++;
           i--;
           j--; 
        }

        return length;
    }

    public static String findBestRhymingWord( List<String> arr, String input) {
        String bestWord = "";
        int maxSuffixLength = 0;

        for (String word : arr) {
            int currentSuffixLength = longestCommonSuffix(word, input);

            if (currentSuffixLength > maxSuffixLength || (currentSuffixLength == maxSuffixLength && word.length()< bestWord.length())) {
                bestWord = word;
                maxSuffixLength = currentSuffixLength;
            }
        }

        return bestWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.next());
        }

        String input = sc.next();
        String result = findBestRhymingWord(arr, input);
        System.out.println(result);

        sc.close();
    }
}