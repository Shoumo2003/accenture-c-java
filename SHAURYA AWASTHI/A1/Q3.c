#include <stdio.h>
#include <limits.h>

main() {
	int n;
	scanf("%d", &n);
	
	int arr[n];
	
	for(int i = 0; i < n; i++) {
		scanf("%d", &arr[i]);
	}
	
	int count = 0;
	int sup = INT_MIN;
	
	for(int i = n - 1; i >= 0; i--) {
		if(arr[i] > sup) {
			count ++;
			sup = arr[i];
		}
	}
	printf("%d", count);
}
