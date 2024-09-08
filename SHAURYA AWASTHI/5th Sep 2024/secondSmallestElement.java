public class secondSmallestElement {
    public static void print2Smallest(int[] arr) {
        int first, second;

        // There should be at least two elements
        if (arr.length < 2) {
            System.out.println("Invalid Input");
            return;
        }

        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // If current element is smaller than first then update both first and second
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            }
            // If arr[i] is in between first and second then update second
            else if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element");
        } else {
            System.out.println(second);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 111, 13, 25, 9, 34, 1 };
        print2Smallest(arr);
    }
}

