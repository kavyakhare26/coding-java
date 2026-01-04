#include<iostream>
using namespace std;
int  main(){
    int no[3][4],r,c;
    cout<<"stored  any no";
    for (r=0;r<=2;r++){
      for(c=0;c<=2;c++){
        cin>>no[r][c];
      }
    }
    for(r=0;r<=2;r++){
      for(c=0;c<=2;c++){
        cout<<no[r][c]<<" ";
        cout<<endl;
      } 
    }
    return 0;

}
