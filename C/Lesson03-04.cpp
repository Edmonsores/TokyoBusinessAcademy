#include <stdio.h>

int main() {
    const int ROWS = 10;
    int i, j;

    printf("Pattern with %d rows:\n\n", ROWS);

    // Outer loop: Controls the number of rows (from 10 down to 1)
    for (i = ROWS; i >= 1; i--) {

        // Inner loop: Controls the number of asterisks in the current row.
        for (j = 1; j <= i; j++) {
            printf("*");
        }
        // Move to the next line to start a new row
        printf("\n");
    }

    return 0;
}