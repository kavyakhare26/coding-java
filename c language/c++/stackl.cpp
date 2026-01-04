#include <iostream>

// Node structure for the linked list
struct Node {
    int data;
    Node* next;

    // Constructor for Node
    Node(int val) : data(val), next(nullptr) {}
};

// Stack class implementation
class Stack {
private:
    Node* top; // Pointer to the top of the stack (head of the linked list)

public:
    // Constructor
    Stack() : top(nullptr) {}

    // Destructor to free memory
    ~Stack() {
        while (top != nullptr) {
            pop(); // Pop all elements to deallocate nodes
        }
    }

    // Push operation: Adds an element to the top of the stack
    void push(int value) {
        Node* newNode = new Node(value);
        if (newNode == nullptr) {
            std::cout << "Stack Overflow: Memory allocation failed." << std::endl;
            return;
        }
        newNode->next = top; // New node points to the current top
        top = newNode;       // Update top to the new node
        std::cout << value << " pushed to stack." << std::endl;
    }

    // Pop operation: Removes and returns the top element from the stack
    int pop() {
        if (isEmpty()) {
            std::cout << "Stack Underflow: Stack is empty." << std::endl;
            return -1; // Or throw an exception
        }
        int poppedValue = top->data;
        Node* temp = top;
        top = top->next; // Move top to the next node
        delete temp;     // Deallocate the old top node
        std::cout << poppedValue << " popped from stack." << std::endl;
        return poppedValue;
    }

    // Peek operation: Returns the top element without removing it
    int peek() {
        if (isEmpty()) {
            std::cout << "Stack is empty." << std::endl;
            return -1; // Or throw an exception
        }
        return top->data;
    }

    // isEmpty operation: Checks if the stack is empty
    bool isEmpty() {
        return top == nullptr;
    }

    // Display operation: Prints the elements of the stack
    void display() {
        if (isEmpty()) {
            std::cout << "Stack is empty." << std::endl;
            return;
        }
        Node* current = top;
        std::cout << "Stack elements: ";
        while (current != nullptr) {
            std::cout << current->data << " ";
            current = current->next;
        }
        std::cout << std::endl;
    }
};

int main() {
    Stack myStack;

    myStack.push(10);
    myStack.push(20);
    myStack.push(30);
    myStack.display();

    std::cout << "Top element is: " << myStack.peek() << std::endl;

    myStack.pop();
    myStack.display();

    myStack.pop();
    myStack.pop();
    myStack.pop(); // Attempt to pop from an empty stack
    myStack.display();

    return 0;
}