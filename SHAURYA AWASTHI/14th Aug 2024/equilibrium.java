import java.util.Scanner;

public class equilibrium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] pre = new int[n];
        int[] suf = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        pre[0] = A[0];
        suf[n - 1] = A[n - 1];

        for (int i = 1; i < n; i++) {
            pre[i] = A[i] + pre[i - 1];
            suf[n - i - 1] = A[n - i - 1] + suf[n - i];
        }

        for (int i = 0; i < n; i++) {
            if (pre[i] == suf[i]) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
        sc.close();
    }    
}
