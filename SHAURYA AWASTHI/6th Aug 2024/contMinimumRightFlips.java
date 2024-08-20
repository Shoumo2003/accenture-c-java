import java.util.Scanner;

public class contMinimumRightFlips {
    public static int solve (int n, int[] A) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count % 2 == 0) {
                if (A[i] == 0) count++;
            } else {
                if (A[i] == 1) count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(n, A));
        sc.close();
    }
}
