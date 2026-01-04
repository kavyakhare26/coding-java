#include<stdio.h>
int main(){
    int n;
    printf("enter a number:");
    scanf("%d",&n);
    int product=1;
    for(int i=1;i<=n;i++ ){
      product=product*i;
      printf("factoraial of number is%d\n",product);
    }
    
    return 0;
}
