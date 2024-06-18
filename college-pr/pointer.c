//to avoid accidental damage to values
//to efficiently store large number of data
//data type of pointer is same as the variable whose address it holds
//size of pointer is 4 or -- depending on the complier architecture


//Q1: create a integer variable and assign ptr to point to the variable, 
//accept the input and store the value in var using pointer
//print the address and value of variable using pointer

/* 
void main(){
    int a;
    int *ptr = &a;
    scanf("%d",ptr);
    printf("Address: %x value: %d",ptr,*ptr); //
} */

//declare a array variable and initalize with 5 values and use pointers to access the individual values in array
#include<stdio.h>

void main(){
    int a;
    int *arr = &a ;
    int odd = 0, even = 0;
    for(int i = 0; i  < 10; i++){
        scanf("%d", (arr));
        if (*(arr) % 2 == 0) even++;
        else odd++;
    }
    // for (int i = 0; i < 10; i++){
    //     printf("%d ", *(arr + i));
    // }
    printf("odd: %d even: %d ", odd ,even);
    //printf("size %d",sizeof(len));
}