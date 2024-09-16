import java.util.HashMap;
import java.util.Scanner;

public class wholeHour {
    public static int solve(int n, int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int d = arr[i] / 60;
            d++;

            int req = (60 * d) - arr[i];
            if (mp.getOrDefault(req, 0) != 0) {
                count += mp.get(req);
                mp.put(req, 0);
            } else {
                mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(solve(n, arr));
        scanner.close();
    }
}

