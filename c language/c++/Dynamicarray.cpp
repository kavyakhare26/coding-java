#include <iostream>
using namespace std;
class Dynamicarray{
    int*arr;
    int size;
    public:
    Dynamicarray(int s){
        size =s;
        arr =new int[size];
        cout<<"enter"<<size<<"element"<<endl;
        for(int i=0;i<size;i++){
            cin>>arr[i];
        }
    }

    void display(){
        cout<<"array element are:"<<endl;
        for(int i=0;i<size;i++){
            cout<<arr[i]<<" ";
            cout<<endl;        
        }
    }
    ~Dynamicarray(){
            delete[] arr;
            cout<<"dynamic memory released\n";
        }
    

};
int main(){
        int n;
        cout<<"enter size of array";
        cin>>n;
        Dynamicarray obj(n);
        obj.display();
        return 0;
}