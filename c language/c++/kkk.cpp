#include <iostream>

using namespace std;

int main() {
    int r1, c1, r2, c2;

    cout << "Enter rows and columns for first matrix: ";
    cin >> r1 >> c1;

    cout << "Enter rows and columns for second matrix: ";
    cin >> r2 >> c2;

    // Check if matrix multiplication is possible
    if (c1 != r2) {
        cout << "Matrix multiplication not possible! Column of first matrix must equal row of second matrix." << endl;
        return 0;
    }

    int a[r1][c1], b[r2][c2], product[r1][c2];

    // Input elements for first matrix
    cout << endl << "Enter elements of first matrix:" << endl;
    for (int i = 0; i < r1; ++i) {
        for (int j = 0; j < c1; ++j) {
           
            cin >> a[i][j];
        }
    }

    // Input elements for second matrix
    cout << endl << "Enter elements of second matrix:" << endl;
    for (int i = 0; i < r2; ++i) {
        for (int j = 0; j < c2; ++j) {
            cout << "Enter element b" << i + 1 << j + 1 << ": ";
            cin >> b[i][j];
        }
    }

    // Initialize product matrix with zeros
    for (int i = 0; i < r1; ++i) {
        for (int j = 0; j < c2; ++j) {
            product[i][j] = 0;
        }
    }

    // Perform matrix multiplication
    for (int i = 0; i < r1; ++i) {
        for (int j = 0; j < c2; ++j) {
            for (int k = 0; k < c1; ++k) {
                product[i][j] += a[i][k] * b[k][j];
            }
        }
    }

    // Display the product matrix
    cout << endl << "Product of the two matrices:" << endl;
    for (int i = 0; i < r1; ++i) {
        for (int j = 0; j < c2; ++j) {
            cout << product[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}