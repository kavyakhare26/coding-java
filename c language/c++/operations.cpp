#include <iostream>
using  namespace std;
void creation(int arr[],int n){
    for(int i=0;i<n;i++){
        cout<<"enter elements:";
        cin>>arr[i];
    }
}
void display(int arr[],int n){
    for(int i=0;i<n;i++){
        cout<<arr[i];
    }
    cout<<endl;
}
int insertion(int arr[],int size,int element,int capacity,int index){
    if(size>=capacity){
        return -1;
    }
    for(int i=size-1;i>=index;i--){
        arr[i+1]=arr[i];
    }
    arr[index]=element;
    return 1;
}
int deleteind(int arr[],int size,int index){
    cout<<"delete element"<<endl;
    for(int i=index;i<size-1;i++){
        arr[i]=arr[i+1];
    }
}
int main(){
    int arr[20];
    int size =5;
    creation(arr,size);
    int element,index;
    //cout<<"enter element to be inserted";
    //cin>>element;
    cout<<"enter index:";
    cin>>index;
    display(arr,size);
    insertion(arr,size,element,100,index);
    size+=1;
    display(arr,size);
    deleteind(arr,size,index);
    size-=1;
    display(arr,size);
    return 0;
}