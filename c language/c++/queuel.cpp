#include <iostream>
using namespace std;

// Define Node structure
struct Node {
    int data;     // The data held by the node
    Node* next;   // Pointer to the next node in the list
};

// Define Queue class
class Queue {
private:
    Node* front;  // Pointer to the front node of the queue
    Node* rear;   // Pointer to the rear node of the queue

public:
    // Constructor initializes an empty queue
    Queue() : front(nullptr), rear(nullptr) {}

    // Destructor to free allocated memory
    ~Queue() {
        while (front != nullptr) {
            Node* temp = front;
            front = front->next;
            delete temp;
        }
    }

    // Enqueue adds an element at the end of the queue
    void enqueue(int x) {
        // Create a new node with given data
        Node* newNode = new Node{x, nullptr};

        // If the queue is empty
        if (rear == nullptr) {
            // Both front and rear point to the new node
            front = rear = newNode;
        } else {
            // Link the new node at the end of the queue
            rear->next = newNode;
            // Update rear to the new node
            rear = newNode;
        }
        std::cout << x << " enqueued to queue." << std::endl;
    }

    // Dequeue removes the element at the front of the queue
    void dequeue() {
        // If the queue is empty, do nothing
        if (front == nullptr) {
            std::cout << "Queue is empty, cannot dequeue." << std::endl;
            return;
        }

        // Temporary pointer to the front node
        Node* temp = front;
        int dequeued_data = temp->data;

        // Move front to the next node
        front = front->next;

        // If the queue is now empty
        if (front == nullptr) {
            // Set rear to nullptr
            rear = nullptr;
        }

        // Delete the old front node
        delete temp;
        std::cout << dequeued_data << " dequeued from queue." << std::endl;
    }

    // Peek returns the front element of the queue without removing it
    int peek() {
        if (!isEmpty()) {
            return front->data;
        } else {
            std::cout << "Queue is empty, no element to peek." << std::endl;
            return -1; // Or throw an exception
        }
    }

    // isEmpty checks if the queue is empty
    bool isEmpty() {
        // Return true if front is nullptr
        return front == nullptr;
    }

    // displayQueue prints all elements in the queue
    void displayQueue() {
        if (isEmpty()) {
            std::cout << "Queue is empty." << std::endl;
            return;
        }
        Node* current = front;
        std::cout << "Queue elements: ";
        while (current != nullptr) {
            std::cout << current->data << " ";
            current = current->next;
        }
        std::cout << std::endl;
    }
};

// Main function to test the Queue implementation
int main() {
    Queue q;

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    q.displayQueue();

    std::cout << "Front element is: " << q.peek() << std::endl;

    q.dequeue();
    q.displayQueue();

    q.enqueue(40);
    q.displayQueue();

    q.dequeue();
    q.dequeue();
    q.dequeue(); // Attempt to dequeue from an empty queue
    q.displayQueue();

    return 0;
}