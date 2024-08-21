import java.util.Scanner;

public class driverProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int count = 0;
        if (n <= 1) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (A[i] > A[i + 1]) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}