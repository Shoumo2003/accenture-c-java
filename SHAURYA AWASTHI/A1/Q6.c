#include <stdio.h>
#include <stdlib.h>

int _mergeSort(int arr[], int temp[], int left, int right);
int merge(int arr[], int temp[], int left, int mid, int right);

int mergeSort(int arr[], int arraySize) {
    int *temp = (int *) malloc(arraySize * sizeof(int));
    int result = _mergeSort(arr, temp, 0, arraySize - 1);
    free(temp);
    return result;
}

int _mergeSort(int arr[], int temp[], int left, int right) {
    int mid, invCount = 0;
    if(right > left) {
        mid = (right + left) / 2;

        invCount += _mergeSort(arr, temp, left, mid);
        invCount += _mergeSort(arr, temp, mid + 1, right);

        invCount += merge(arr, temp, left, mid + 1, right);
    }
    return invCount;
}

int merge(int arr[], int temp[], int left, int mid, int right) {
    int i, j, k;
    int invCount = 0;

    i = left;
    j = mid;
    k = right;
    while ((i <= mid - 1) && (j <= right)) {
        if (arr[i] <= arr[j]) {
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
            invCount = invCount + (mid - i);
        }
    }

    while (i <= mid - 1)
        temp[k++] = arr[i++];
    while (j <= right)
        temp[k++] = arr[j++];
    for (i = left; i <= right; i++)
        arr[i] = temp[i];

    return invCount;
}

int main() {
    int arr[] = {1, 20, 6, 4, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    int ans = mergeSort(arr, n);
    printf("Number of inversions are : %d\n", ans);
    return 0;
}