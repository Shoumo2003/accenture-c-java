import java.util.Scanner;
import java.util.Arrays;

public class maxCandies {
    public static int maxCandies(int N, int[] prices, int M) {
        int freeCandies = 0;

        for (int i = 0; i < N; i++) {
            if (prices[i] % 5 == 0) {
                freeCandies++;
            } else {
                if (prices[i] <= M) {
                    M -= prices[i];
                    freeCandies++;
                }
            }
        }

        return freeCandies;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();

        Arrays.sort(arr);

        System.out.println(maxCandies(N, arr, M));
        sc.close();
    }
}