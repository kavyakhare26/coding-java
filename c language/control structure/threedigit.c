#include <stdio.h>
int main(){
    int n;
    printf("enter anumber:");
    scanf("%d",&n);
    if(n%5==0|| n%3==0){
        printf("the no is divisible by 3or 5");

    }
    else{
        printf("not divisible");
    }
    return 0;    
}