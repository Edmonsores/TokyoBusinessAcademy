#include <stdio.h>

int main() {
    int sum = 0;
    int last_number = 0;

    for (int i = 10; i <= 50; i++) {
        // Check if the current number is a multiple of 3
        if (i % 3 == 0) {
            // Check if adding the number will exceed 100
            if (sum + i > 100) {
                printf("Stopping at i = %d because sum (%d) + %d would exceed 100.\n", i, sum, i);
                last_number = i;
                break; // Exit the loop
            }

            // Add to the sum and update the last number
            sum += i;
            last_number = i;
            printf("Added %d. New sum is %d.\n", i, sum);
        }
    }

    printf("Final Sum: %d\n", sum);
    printf("The last multiple of 3 added to the sum was: %d\n", last_number);

    return 0;
}