#include<stdio.h>
void binary(int n){
   if (n == 0) return;
   binary(n/2);
   printf("%d",n%2);
   
}
//  int main(){
//     int num;
//     printf("Enter number:");
//     scanf("%d",&num);
//     binary(num);  
//     return 0;
// }

//#include<stdio.h>
static int max;
void lcm(int a,int b){
    if(max % a == 0 && max % b ==0){
        printf("%d",max);
        return; 
    }
    ++max;
    lcm(a,b);
}
int main(){
    int n,m;
    printf("Enter two numbers: ");
    scanf("%d %d",&n,&m);
    max = n > m ? m : n;
    lcm(n,m);
}