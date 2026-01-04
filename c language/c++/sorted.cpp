#include <iostream>
using namespace std;

// Function to check if an array is sorted in ascending order
bool isArraySorted( int arr[], int size) {
    if (size <= 1) {
        return true; // An array with 0 or 1 element is considered sorted
    }

    for (int i = 1; i < size - 1; ++i) {
        if (arr[i] < arr[i - 1]) {
            return false; // Found an unsorted pair
        }
    }
    return true; // All pairs were sorted
}

int main() {
    int arr[] ={1,3,4,5,6};
    cout << "sortedArr is sorted: " << (isArraySorted(arr, 5) ? "true" : "false") << std::endl;

}

    