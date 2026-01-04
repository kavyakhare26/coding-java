#include <iostream>
using namespace std;
int main(){
    double num1 ,num2;
    char op;
    cout<<"enter 1 ni:";
    cin>>num1;
    cout<<"enter 2 no:";
    cin>>num2;
    cout<<"enter operator";
    cin>>op;
    switch(op){
        case '+':
        cout<<"result:"<<num1+num2;
        break;
        case '-':
        cout<<num1-num2;
        break;
        case '*' :
        cout<<num1*num2;
        break;
        case '/' :
        if (num1/num2==0){
          cout<<"not possible";
        }
        else{
            cout<<"result:"<<num1/num2;
            break;
            
        }
        default:
        cout<<"invalid";
        break;


    }
    return 0;
}  