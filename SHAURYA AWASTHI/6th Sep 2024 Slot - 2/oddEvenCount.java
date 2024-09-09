import java.util.Scanner;

public class oddEvenCount {
    public static String solve(int n, int[] arr) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                s.append("even");
            } else {
                s.append("odd");
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print(solve(n, arr));
        scanner.close();
    }
}

