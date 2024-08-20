public class countInversionPair {

    private static int mergeSort(int[] arr, int[] temp, int left, int right) {
        int mid, invCount = 0;
        if (right > left) {
            mid = (right + left) / 2;

            invCount += mergeSort(arr, temp, left, mid);
            invCount += mergeSort(arr, temp, mid + 1, right);

            invCount += merge(arr, temp, left, mid + 1, right);
        }
        return invCount;
    }

    private static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i, j, k;
        int invCount = 0;

        i = left;
        j = mid;
        k = left;
        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];

                invCount += (mid - i);
            }
        }

        while (i <= mid - 1)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];

        System.arraycopy(temp, left, arr, left, right - left + 1);

        return invCount;
    }

    public static int countInversions(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        return mergeSort(arr, temp, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        int ans = countInversions(arr);
        System.out.println("Number of inversions are " + ans);
    }
}

