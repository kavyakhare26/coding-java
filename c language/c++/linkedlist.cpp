#include <iostream>
using namespace std;
struct Node{
    int data;
    Node* next;
};
Node* head =nullptr;
void insert(int n){
    Node* newNode =new Node;
    newNode->data =n;
    newNode->next =head;
    head =newNode;
}
void display(){
    cout<<"data element in n"<<endl;
    Node*temp =head;
    while(temp!=nullptr){
        cout<<temp->data<<" ";
        temp =temp->next;
        
    }
    cout<<endl;
}
int main(){
    insert(15);
    insert(10);
    insert(5);
    display();
    return 0;
}
