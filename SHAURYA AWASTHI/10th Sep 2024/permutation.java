import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();
        char ch = scanner.next().charAt(0);
        
        int c = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) c++;
        }
        System.out.println(c);
        
        scanner.close();
    }
}

