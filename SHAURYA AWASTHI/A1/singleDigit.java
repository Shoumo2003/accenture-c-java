import java.util.Scanner;

public class singleDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        while (n > 9) {
            if (n % 2 == 0) {
                n = (int) Math.floor((n - 2) / 2.0);
            } else {
                n = (int) Math.floor(n / 2.0);
            }
        }
        
        System.out.println(n);
        scanner.close();
    }
}

