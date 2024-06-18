#include<stdio.h>
#include<string.h>

void print(int n){
    if(n == 0)
        return;
    print(n-1);
    printf("%d ",n);

}
void printRer(char s[], int n){
    if(n == -1) return;
    printf("%c",s[n-1]);
    printRer(s,n-1);
}
void main(){
    // int n;
    // printf("Enter the upper limit\n");
    // scanf("%d", &n);
    // print(n);
    char s[100];
    scanf("%s",s);
    printRer(s, strlen(s));
}