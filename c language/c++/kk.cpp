#include <iostream> // Required for input/output operations


int main() {
    int size;

    // Get the size of the array from the user
    std::cout << "Enter the size of the array: ";
    std::cin >> size;

    // Validate the size
    if (size <= 0) {
        std::cout << "Array size must be positive." << std::endl;
        return 1; // Indicate an error
    }

    // Declare an array of the given size
    int arr[size]; 

    // Get array elements from the user
    std::cout << "Enter " << size << " elements of the array:" << std::endl;
    for (int i = 0; i < size; ++i) {
        std::cout << "Element " << i + 1 << ": ";
        std::cin >> arr[i];
    }

    // Initialize largest and smallest with the first element
    int largest = arr[0];
    int smallest = arr[0];

    // Iterate through the array to find the largest and smallest elements
    for (int i = 1; i < size; ++i) {
        if (arr[i] > largest) {
            largest = arr[i]; // Update largest if a larger element is found
        }
        if (arr[i] < smallest) {
            smallest = arr[i]; // Update smallest if a smaller element is found
        }
    }

    // Display the results
    std::cout << "\nLargest element: " << largest << std::endl;
    std::cout << "Smallest element: " << smallest << std::endl;

    return 0; // Indicate successful execution
}

