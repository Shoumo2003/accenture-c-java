import java.util.Arrays;
import java.util.Scanner;

public class candyProblem {

    public static int solve(int n, int[] candy, int m) {
        Arrays.sort(candy);
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (candy[i] % 5 == 0) {
                count++;
            } else if (candy[i] <= m) {
                count++;
                m -= candy[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] candy = new int[n];
        for (int i = 0; i < n; i++) {
            candy[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        System.out.println(solve(n, candy, m));

        scanner.close();
    }
}

