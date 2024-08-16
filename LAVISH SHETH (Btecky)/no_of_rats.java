import java.util.Scanner;

public class no_of_rats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        sc.close();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.err.println(Check(arr, r, unit, n));
    }

    public static int Check(int arr[], int r, int unit, int n) {
        if (arr.length == 0) {
            return -1;
        }

        int tFood = r * unit;
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            res += arr[i];
            if (res >= tFood) {
                return i + 1;
            }
        }

        return 0;
    }
}