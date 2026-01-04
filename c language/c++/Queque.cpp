#include <iostream>

#define SIZE 5 // Define the maximum size of the queue

class Queue {
private:
    int arr[SIZE];
    int front; // Index of the front element
    int rear;  // Index of the rear element

public:
    // Constructor to initialize the queue
    Queue() {
        front = -1;
        rear = -1;
    }

    // Function to check if the queue is empty
    bool isEmpty() {
        return front == -1;
    }

    // Function to check if the queue is full
    bool isFull() {
        return rear == SIZE - 1;
    }

    // Function to add an element to the queue (enqueue)
    void enqueue(int value) {
        if (isFull()) {
            std::cout << "Queue is full. Cannot enqueue " << value << std::endl;
            return;
        }
        if (isEmpty()) {
            front = 0; // Set front to 0 if the queue was empty
        }
        rear++;
        arr[rear] = value;
        std::cout << "Enqueued: " << value << std::endl;
    }

    // Function to remove an element from the queue (dequeue)
    int dequeue() {
        if (isEmpty()) {
            std::cout << "Queue is empty. Cannot dequeue." << std::endl;
            return -1; // Return a sentinel value indicating error
        }
        int dequeuedValue = arr[front];
        if (front == rear) { // If only one element was in the queue
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        std::cout << "Dequeued: " << dequeuedValue << std::endl;
        return dequeuedValue;
    }

    // Function to get the front element of the queue without removing it
    int peekFront() {
        if (isEmpty()) {
            std::cout << "Queue is empty. No front element." << std::endl;
            return -1;
        }
        return arr[front];
    }

    // Function to display the elements of the queue
    void display() {
        if (isEmpty()) {
            std::cout << "Queue is empty." << std::endl;
            return;
        }
        std::cout << "Queue elements: ";
        for (int i = front; i <= rear; i++) {
            std::cout << arr[i] << " ";
        }
        std::cout << std::endl;
    }
};

int main() {
    Queue myQueue;

    myQueue.enqueue(10);
    myQueue.enqueue(20);
    myQueue.enqueue(30);
    myQueue.display();

    myQueue.dequeue();
    myQueue.display();

    return 0;
}