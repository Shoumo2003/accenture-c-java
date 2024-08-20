// Regions on a plane

import java.util.Scanner;

public class regionsOnAPlane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        System.out.println(1 + n * (n + 1) / 2);
        
        scanner.close();
    }
}

