import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class pickNotPick {
    public static int solve(int n, List<Integer> arr) {
        int lar = Integer.MIN_VALUE;
        int sLar = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr.get(i) > lar) {
                sLar = lar;
                lar = arr.get(i);
            } else if (arr.get(i) < lar && arr.get(i) > sLar) {
                sLar = arr.get(i);
            }
        }

        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == sLar) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        System.out.println(solve(n, arr));
        scanner.close();
    }
}

