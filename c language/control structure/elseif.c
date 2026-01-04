#include<stdio.h>
int main(){
    int n;
    printf("enter percentage:");
    scanf("%d",&n);
    if(n>80){
        printf("a grade\n");
    }
    else if(n>60){
        printf("B grade\n");

    }
    else if(n>40){
        printf(" Cgrade\n");

    }
    else{
        printf("D grade \n");

    }
    return 0;
}