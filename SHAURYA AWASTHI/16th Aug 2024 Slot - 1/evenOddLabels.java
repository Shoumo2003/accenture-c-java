import java.util.Scanner;

public class evenOddLabels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                ans.append("even");
            } else {
                ans.append("odd");
            }
        }

        System.out.print(ans.toString());
        scanner.close();
    }
}

