import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maxFrequencyVowel {

    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        Map<Character, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
            }
        }
        
        for (Map.Entry<Character, Integer> it : mp.entrySet()) {
            System.out.println(it.getKey() + "-" + it.getValue());
        }
        
        scanner.close();
    }
}

