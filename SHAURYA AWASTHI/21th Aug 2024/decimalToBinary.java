
import java.util.Scanner;

public class decimalToBinary {
    public static String solve(int n) {
        String ans = "";
        while (n > 0) {
            ans = (n % 2 == 0 ? "0" : "1") + ans;
            n /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        System.out.println(solve(N));
        sc.close();
    }
}
