#include <stdio.h>
void main(){
    int n,m, mat[100][100]; 
    scanf("%d",&n);
    for(int i = 0; i<n; i++){
        for(int j = 0; j < n; j++){
            scanf("%d",&mat[i][j]);
        }
    }

    int sum = 0;
    for(int i = 0; i < n; i++){
        sum += mat[i][i];
    }
    printf("sum: %d",sum);

}