import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class permutation {
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
        mp.put('A', 0);
        mp.put('E', 0);
        mp.put('I', 0);
        mp.put('O', 0);
        mp.put('U', 0);
        mp.put('a', 0);
        mp.put('e', 0);
        mp.put('i', 0);
        mp.put('o', 0);
        mp.put('u', 0);

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!mp.containsKey(s.charAt(i))) count++;
        }

        if (count == 0) {
            System.out.println(0);
            return;
        }
        System.out.println(fact(count));
        scanner.close();
    }
}

