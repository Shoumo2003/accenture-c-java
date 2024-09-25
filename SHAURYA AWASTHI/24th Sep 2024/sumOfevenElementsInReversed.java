import java.util.ArrayList;

public class sumOfevenElementsInReversed {
    public static int sumOfEvenIndexInReversedArray(ArrayList<Integer> arr) {
        int sum = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            int Ridx = n - 1 - i;
            if (Ridx % 2 == 0) {
                sum += arr.get(i);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // Example array
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        int result = sumOfEvenIndexInReversedArray(arr);
        System.out.println("Sum of elements at even indices in the reversed array: " + result);
    }
}

