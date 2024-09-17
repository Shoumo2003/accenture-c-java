import java.util.Arrays;

public class reversedSubArray {
    // Return true, if reversing the subarray will sort the array, else return false.
    public static boolean checkReverse(int[] arr) {
        int n = arr.length;
        // Copying the array.
        int[] temp = Arrays.copyOf(arr, n);

        // Sort the copied array.
        Arrays.sort(temp);

        // Finding the first mismatch.
        int front;
        for (front = 0; front < n; front++) {
            if (temp[front] != arr[front]) {
                break;
            }
        }

        // Finding the last mismatch.
        int back;
        for (back = n - 1; back >= 0; back--) {
            if (temp[back] != arr[back]) {
                break;
            }
        }

        // If whole array is sorted
        if (front >= back) {
            return true;
        }

        // Checking subarray is decreasing or not.
        do {
            front++;
            if (arr[front - 1] < arr[front]) {
                return false;
            }
        } while (front != back);

        return true;
    }

    // Driver Program
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 4, 3 };

        System.out.println(checkReverse(arr) ? "Yes" : "No");
    }
}

