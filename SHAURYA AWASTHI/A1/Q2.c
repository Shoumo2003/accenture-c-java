#include <stdio.h>
#include <math.h>

int main() {
	int n;
	scanf("%d", &n);
	while (n > 9) {
		if(n % 2 == 0) {
			n = floor((n - 2) / 2.0);
		}
		else {
			n = floor(n / 2.0);
		}
	}
	printf("%d", n);
	return 0;
}
