import java.util.Scanner;

public class stonesOnTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String s = scanner.next();
        
        int c = 0;
        
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                c++;
            }
        }
        
        System.out.println(c);
        scanner.close();
    }
}

