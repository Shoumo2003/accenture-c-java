#include <stdio.h>
#include <stdlib.h>

int maxi = 0;

void solve(int idx, int* arr, int arr_size, int* aux, int aux_size)
{
    if (idx == arr_size) // edge case
    {
        if (maxi < aux_size) maxi = aux_size;
        return;
    }
    
    if (aux_size == 0 || aux[aux_size-1] * 3 == arr[idx])  // pick
    {
        aux[aux_size] = arr[idx];
        solve(idx+1, arr, arr_size, aux, aux_size+1);
    }
    
    solve(idx+1, arr, arr_size, aux, aux_size); // not pick
}

int main() {
    int n;
    scanf("%d", &n);
    
    int* arr = (int*)malloc(n * sizeof(int));
    
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    int* aux = (int*)malloc(n * sizeof(int));
    int idx = 0;
    
    solve(idx, arr, n, aux, 0);
    
    printf("%d", maxi);
    
    free(arr);
    free(aux);

    return 0;
}

