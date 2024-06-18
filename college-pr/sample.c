#include <stdio.h>

void main(){
    int arr[100];
    int n, i=0;
    scanf("%d",&n);
    while(n>0){
        arr[i++] = n % 2;
        n = n/2;
    }
    printf("Binary: ");
    for(int j = i; j >= 0 ; j--){
        printf("%d",arr[j]);
    }

    printf("Fibnocii series");
    arr[0] = 0;
    arr[1] = 1;
    for(i = 2; i < n; i++){
        arr[i] = arr[i-1]+arr[i-2];
    }
    for (int j = 0; j < n; j++)
    {
        printf("%d ", arr[j]);
    }
    
}