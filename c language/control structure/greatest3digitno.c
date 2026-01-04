#include <stdio.h>
int main()
{
    int a;
    printf("enter 1st digit no");
    scanf("%d",&a);
    printf("enter 2nd no");
    int b;
    scanf("%d",&b);
    int c;
    printf("enter 3rd  no");
    scanf("%d",&c);
    if (a>b)
    {
       if(a>c)
           printf("%d is gretest",a);
       
       else
           printf("%d is gretest",c);
       
    }   

    else{
        if(b>c)
           printf("%d is gretest",b);
        
        else
            printf("%d is gretest",c);
        
    }      
    return 0;

}      

