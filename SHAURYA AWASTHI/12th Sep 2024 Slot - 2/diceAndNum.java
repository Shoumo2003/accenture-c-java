import java.util.Scanner;

public class diceAndNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        
        int N = 0, s1 = 0, s2 = 0;
        
        int flag = 0;
        while (n > 0) {
            if (flag == 0) s1 += n % 10;
            else s2 += n % 10;
            
            n /= 10;
            N++;
            flag = 1 - flag;
        }
        
        int even, odd;
        
        if (N % 2 == 1) {
            even = s1;
            odd = s2;
        } else {
            even = s2;
            odd = s1;
        }
        
        if (d % 2 == 1) System.out.println(even);
        else System.out.println(odd);
        
        scanner.close();
    }
}

