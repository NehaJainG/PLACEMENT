#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    char s[1000],c;
    int digit_count[10],i;
    scanf("%s",s);
    for(i = 0; i < 10; i++) digit_count[i] = 0;
    
    for(i = 0; *(s+i) != '\0'; i++){
        c = *(s+i);
        if( c > 47 && c < 58) digit_count[ c - 48]++;
    }

    for(i = 0; i < 10; i++) printf("%d ",digit_count[i]);
    return 0;
}