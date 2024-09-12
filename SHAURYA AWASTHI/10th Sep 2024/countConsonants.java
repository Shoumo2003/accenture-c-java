import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countConsonants {

    public static boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
               ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) return 1;
        int ans = 1;
        while (n > 0) {
            ans *= n--;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        Map<Character, Integer> mp = new HashMap<>();
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (!isVowel(s.charAt(i))) {
                count++;
                mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
            }
        }
        
        if (count == 0) {
            System.out.println(0);
            return;
        }
        
        int deno = 1;
        
        for (Map.Entry<Character, Integer> it : mp.entrySet()) {
            deno *= fact(it.getValue());
        }
        
        System.out.println(fact(count) / deno);
    }
}

