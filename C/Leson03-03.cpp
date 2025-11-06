#include <stdio.h>

int main() {
    int number;
    int count = 0; 

    printf("Enter an integer: ");
    scanf("%d", &number);

    if (number == 0) {
        count = 1;
    }

    while (number > 0) {
        number = number / 10; // Removes the last digit (integer division)
        count++;            
    }

    printf("The number has %d digit(s).\n", count);
    return 0;
}