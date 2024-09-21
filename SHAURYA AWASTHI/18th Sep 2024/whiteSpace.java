import java.util.*;

public class whiteSpace {
    public static int solve(int n, List<Integer> arr, int k) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            if (i < k) sum1 += arr.get(i);
            if (n - i - 1 > k) sum2 += arr.get(n - i - 1);
        }
        System.out.println(sum1 + " " + sum2);

        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        int c1 = 0, c2 = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') c1++;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == ' ') c2++;
        }

        int diff = Math.abs(c1 - c2);

        if (diff % 2 != 0) System.out.print("Odd" + diff);
        else System.out.print("Even" + diff);
    }
}

