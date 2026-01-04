#include <stdio.h>
int main(){
    int n;
    printf("enter a no:");
    scanf("%d",&n);
    if (n<0){
        n=n*(-1);
    }
    printf("absolute value:%d",n);
    
        
    
    return 0;
}