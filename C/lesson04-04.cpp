#include <stdio.h>

int main() {
    int rows = 4;        // The pattern has 4 rows (7, 5, 3, 1)
    int max_asterisks = 7;
    int i, j;

    printf("--- é¿çsåãâ  (Execution Result) ---\n");

    // Outer loop controls the rows (i = 0, 1, 2, 3)
    for (i = 0; i < rows; i++) {

        // 1. Inner loop for SPACES:
        // Prints 'i' sets of spaces to center the pattern.
        for (j = 0; j < i; j++) {
            printf("  "); // Print two spaces for alignment
        }

        // 2. Inner loop for ASTERISKS:
        // The number of asterisks in row 'i' is calculated as: 
        // max_asterisks - (2 * i) 
        int num_asterisks = max_asterisks - (2 * i);

        for (j = 0; j < num_asterisks; j++) {
            printf("* "); // Print asterisk followed by a space
        }

        // Move to the next line
        printf("\n");
    }

    return 0;
}