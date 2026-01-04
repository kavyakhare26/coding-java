#include<iostream>
using namespace std;
int main(){
        int number[12];
        int sumofevenno =0;
        cout<<"enter 12 number:";
        for(int i=0;i<12;i++){
            cout<<"enter number";
            cin >> number[i];

        }
        for(int i=0;i<12;i++){
            if(number[i]%2==0){
                sumofevenno+=number[i];
            }
        }
        cout<<"the sum of all even number in array is";
        cout<< sumofevenno;
        return 0;
}
