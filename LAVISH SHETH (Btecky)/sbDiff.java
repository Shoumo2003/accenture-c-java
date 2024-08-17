public class sbDiff {
    public static void main(String[] args) {
        int arr[] = {12, 3, 14, 56, 77, 13};
        int num = 13;
        int diff = 2;
        int n = arr.length;
        System.err.println(findCount(arr, n, num, diff));
    }

    public static int findCount(int arr[], int length, int num, int diff) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (Math.abs(arr[i] - num) <= diff) {
                count++;
            }
        }

        return count;
    }
}