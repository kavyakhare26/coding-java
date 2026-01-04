#include <iostream>
using namespace std;
class Stack{
    private:
      int*arr;
      int top;
      int capacity;
    public:
     Stack(int cap){
      capacity =cap;
      arr= new int [capacity];
      top =-1;
     }
    
    void push(int value){
        if(top>=capacity -1){
            cout<<"stack overflow"<<endl;
        }
        else{
            arr[++top]=value;
        }
    }
        void pop(){
            if(top<0){
                cout<<"stack underflow!";
                return;

            }
            cout<<"pop"<<arr[top--]<<endl;
        }
        void peek(){
            if(top<0){
                cout<<"stack is empty";
                return;
            }
            cout<<"top element is:"<<arr[top];
        }
        void traverse(){
            if(top<0){
                cout<<"stack is empty";
                return;
            }else{
        
               for(int i=top;i>=0;i--){
                  cout<<arr[i]<<" ";
               }
               cout<<endl;
            }
        }
};
int main(){
        int capacity;
        cout<<"enter the capacity of the stack";
        cin>>capacity;
        Stack mystack(capacity);
        int choice;
        do{
            cout<<"menu";
            cout<<"1.push";
            cout<<"2.pop";
            cout<<"3.peek";
            cout<<"4.traverse";
            cout<<"enter your choice:";
            cin>>choice;
            switch(choice){
                case 1:
                  int value;
                  cout<<"enter value to push:";
                  cin>>value;
                  mystack.push(value);
                  break;
                case 2:
                  mystack.pop();
                  break;
                case 3:
                  mystack.peek();
                  break;
                case 4:
                  mystack.traverse();
                  break;
                case 5:
                  cout<<"exit";
                  break;
                default:
                  cout<<"invalid choice";
            }
        
        }while(choice!=5);
            return 0;
}    
