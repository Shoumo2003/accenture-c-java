import java.util.Scanner;

public class stringConcat {
    public static String solve(int n, String s) {
        StringBuilder ans = new StringBuilder();
        
        while (n-- > 0) {
            ans.append(s);
        }
        
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        
        System.out.println(solve(n, s));
        
        scanner.close();
    }
}

