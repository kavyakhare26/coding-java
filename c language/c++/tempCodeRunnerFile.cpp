
public:
  stop(){
  int top =-1;
  }

void push(int val) {
    if (top == size - 1) {
        cout << "Stack Overflow: Cannot push " << val << ". Stack is full." << endl;
    } else {
        top++;
        arr[top] = val;
        cout << val << " pushed to stack." << endl;
    }
}


void pop() {
    if (top ==-1) {
        cout << "Stack Underflow: Cannot pop. Stack is empty." << endl;
    } else {
        cout << "Popped element: " << arr[top--] << endl;
        
    }
}

void peek(){

    if (top ==-1 ) {
       cout << "Stack is empty. No element to peek." <<endl;
    } else {
        cout << "Top element: " << arr[top] << endl;
    }
}


void display() {
    if (top ==-1) {
        cout << "Stack is empty." << endl;
    } else {
        cout << "Stack elements: ";
        for (int i = top; i >= 0; i--) {
            cout << arr[i] << endl;
        }

    }
};


int main() {
    stop s;
    int size;
    cin>>size;