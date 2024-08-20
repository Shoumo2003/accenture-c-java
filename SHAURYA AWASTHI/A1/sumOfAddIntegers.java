import java.util.ArrayList;
import java.util.Scanner;

public class sumOfAddIntegers {
    public static int sumOfOddElements(ArrayList<Integer> arr) {
        int sumOdd = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sumOdd += num;
            }
        }
        return sumOdd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        
        int result = sumOfOddElements(arr);
        System.out.println(result);

        scanner.close();
    }
}

