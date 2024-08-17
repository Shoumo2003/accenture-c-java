import java.util.Scanner;
import java.lang.Math;

public class rearrangeBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count  = 0;

        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }

        int ans = (int)Math.pow(2, count) - 1;

        System.err.println(ans);
        sc.close();
    }
}
