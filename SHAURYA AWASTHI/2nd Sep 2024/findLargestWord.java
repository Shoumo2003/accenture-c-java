import java.util.Scanner;

public class findLargestWord {
    public static String findLargestWord(String input) {
        String largestWord = "";
        String[] words = input.split("\\."); // Split the string by '.'

        // Find the largest word
        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word; // Update the largest word if the current word is longer
            }
        }

        return largestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String largestWord = findLargestWord(input);
        System.out.println(largestWord.length());

        scanner.close();
    }
}

