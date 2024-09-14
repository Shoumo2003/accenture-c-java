import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int sum = 0;
        int c = 0;
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 6 == 0) {
                sum += arr[i];
                c++;
            }
        }
        
        System.out.println(sum / c);
        
        scanner.close();
    }
}

