#include <stdio.h>

int main() {
    int num;

    // Prompt the user for input
    printf("Enter an integer: ");
    scanf("%d", &num);

    // Check the ranges and print the corresponding grade
    if (num < 60) {
        printf("D\n");
    }
    else if (num < 80) {
        printf("C\n");
    }
    else if (num < 90) {
        printf("B\n");
    }
    else {
        printf("A\n");
    }

}