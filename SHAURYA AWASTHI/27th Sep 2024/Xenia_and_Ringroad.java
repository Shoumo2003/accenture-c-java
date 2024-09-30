import java.util.Scanner;

public class Xenia_and_Ringroad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[] task = new int[m];
        long ans = 0;
        int curr = 1;
        
        for (int i = 0; i < m; i++) {
            task[i] = scanner.nextInt();
            int diff = task[i] - curr;
            
            ans += diff;
            if (diff < 0) ans += n;
            
            curr = task[i];
        }
        
        System.out.println(ans);
        scanner.close();
    }
}

