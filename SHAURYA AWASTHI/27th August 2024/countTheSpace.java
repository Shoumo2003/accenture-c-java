import java.util.Scanner;

public class countTheSpace {
    public static String solve(String s1, String s2) {
        int A = 0, B = 0;

        for (int i = 0; i < s1.length(); i++) {
           if (s1.charAt(i) == ' ') A++;  
        }
        for (int i = 0; i < s2.length(); i++) {
           if (s2.charAt(i) == ' ') B++;  
        }
        int diff = Math.abs(A - B);

        return (diff % 2 == 0) ? "Even: " + diff : "Odd: " + diff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(solve(s1, s2));
        sc.close();
    }
}