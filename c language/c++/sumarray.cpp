#include <iostream>
using namespace std;
int main(){
    int row1,cols1;
    int row2,cols2;
    int k;
    
    cout<<"enter row1:";
    cin>>row1;
    cout<<"enter column1";
    cin>> cols1;
    cout<<"enter row2";
    cin>>row2;
    cout<<"enter column2";
    cin>>cols2;
    
    int m1[row1][cols1];
    int m2[row2][cols2];
    int summatrix[row1][cols1];
    //int multimatrix[row1][cols2];
    for(int i=0;i<row1;i++){
      for(int j=0;j<cols1;j++){
      cout<<"enter element of matrix one ";
      cin>>m1[i][j];
      }
    }
    cout<<"enter element in second matrix"<<endl;
    for(int i=0;i<row2;i++){
        for(int j=0;j<cols2;j++){
            cout<<"enter element"<<endl;
            cin>>m2[i][j];

        }
    }
    for(int i=0;i<row1;i++){
        for(int j=0;j<cols1;j++){
            summatrix[i][j]=m1[i][j] + m2[i][j];        
        }
    }

    cout<<"sum of matrix"<<endl;
    for(int i=0;i<row1;i++){
        for(int j=0;j<cols1;j++){
            cout<<summatrix[i][j]<<"\t";
        }
        cout<<endl;

    }

   /* cout<<"multiplication of matrix";
    for(int i=0;i<row1;i++){
        for(int j=0;j<cols2;j++){
            for(int k =0;k<cols1;k++){
                 multimatrix[i][j]=m1[i][k]*m2[k][j]; 
            }
        }
    }
    cout<<"multiplication of matrix"<<endl;
    
    for(int i=0;i<row1;i++){
        for(int j=0;j<cols2;j++){
            //for(int k=0;k<cols1;k++){
            cout<<multimatrix[i][j]<<"\t";
            //}
        }
        cout<<endl;
        
    }*/
    return 0;
}
   
   