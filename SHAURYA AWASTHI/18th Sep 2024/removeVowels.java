import java.util.Scanner;

public class removeVowels {

    public static int fact(int n) {
        if (n == 0 || n == 1) return 1;

        int ans = 1;

        for (int i = 2; i <= n; i++)
            ans *= i;

        return ans;
    }

    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }

        int ans = -1;

        for (int i = 0; i < n; i++) {
            String str = arr[i];
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (!isVowel(str.charAt(j))) {
                    count++;
                }
            }

            ans = Math.max(ans, count);
        }

        System.out.println(fact(ans));
        scanner.close();
    }
}

