import java.util.Scanner;

public class QueueAtSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        String s = scanner.next();
        
        while (t-- > 0) {
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == 'B' && s.charAt(i + 1) == 'G') {
                    s = s.substring(0, i) + 'G' + 'B' + s.substring(i + 2);
                    i++;
                }
            }
        }
        
        System.out.println(s);
        scanner.close();
    }
}

