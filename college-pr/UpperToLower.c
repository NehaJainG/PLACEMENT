#include<stdio.h>
#include<string.h>
#include <ctype.h>

void main(){
    char str[100];
    scanf("%s",str);
    for(int i = 0; str[i] != '\0'; i++){
        if(str[i] >= 97 && str[i] <=112) str[i] = str[i] -32;
    }
    printf("%s %d",str,strlen(str));
    
}