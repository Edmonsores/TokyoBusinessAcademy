#include <stdio.h>

int main() {
    int start, end, i;
    long long sum = 0;
    int count = 0;
    float average;
    do {
        printf("Enter the starting number: ");
        scanf("%d", &start);
        printf("Enter the ending number: ");
        scanf("%d", &end);

        if (start > end) {
            printf("\nInput error\n");
        }
    } while (start > end);

    for (i = start; i <= end; i++) {
        sum += i;
        count++;
    }

 
    if (count > 0) {
        average = (float)sum / count;
    }
    else {
        average = 0.0;
    }

    printf("\nRange: %d to %d\n", start, end);
    printf("Sum of the numbers in the range: %lld\n", sum);
    printf("Count of numbers: %d\n", count);
    printf("Average of the numbers: %.2f\n", average);

    return 0;
}