#include<iostream>
using namespace std;
int main(){
    int marks;
    cout<<"enter a student marks:"<<endl;
    cin>>marks;
    if(marks>=90){
        cout<<"grade is A";
    }
    
    else{
        if(marks>=75){
            cout<<"grade is B";
        }
        else{
            if (marks>=50){
                  cout<<"grade is c";
            }
            else{
                if(marks>=35){
                     cout<<"grade is D";
                }
            
                else{
                    if(marks<35){
                      cout<<"grade is F:";
                    }
                    else{
                        cout<<"fail";
                    }
        
                }
            }    

        
        }
         
            
    }    
    
}
    
