#include<iostream>
using namespace std;
int factorial(int x){
    int fact =1;
    for(int i=x;i>=1;i--){
        fact =fact*i;
    }
    return fact;
}
    int multiplicationtable(int n){
        cout<<"multiplication"<<n<<endl;
        for(int i=1;i<=10;i++){
            cout<<n<<"x"<<i<<"="<<(n*i)<<endl;
        }
    }
        
    
int main(){
    int n;
     cout<<"enter a number to find factorial";
     cin>>n;
     int f = factorial(n);
     cout<<"factorial is "<<f<<endl;
     int numtable;
     cout<<"enter a num to print its multiplication table:";
     cin>>numtable;
     multiplicationtable(numtable);
     return 0;

   
}