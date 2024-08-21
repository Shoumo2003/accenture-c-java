import java.util.Scanner;

public class multipleOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] % 3 == 0) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
