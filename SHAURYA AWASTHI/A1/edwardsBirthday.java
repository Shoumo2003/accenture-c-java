import java.util.Scanner;

public class edwardsBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        System.out.println(1 + n * (n + 1) / 2);
        
        scanner.close();
    }
}

