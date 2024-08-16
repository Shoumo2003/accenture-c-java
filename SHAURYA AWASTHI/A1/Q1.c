#include <stdio.h>
#include <stdlib.h>

int sumOfOddIntegers (int* arr, int n) {
	int sumOdd = 0;
	for (int i = 0; i < n; i++) {
		if (arr[i] % 2 != 0) {
			sumOdd += arr[i];
		}
	}
	return sumOdd;
}

int main() {
	int n;
	scanf("%d", &n);
	
	int* arr = (int*)malloc(n* sizeof(int));
	for (int i = 0; i < n; i++) {
		scanf("%d", &arr[i]);
	}  

    int result = sumOfOddIntegers(arr, n);
    printf("%d\n", result);
    
    free(arr);
    return 0;
}
