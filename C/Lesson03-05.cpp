#include <stdio.h>

int main() {
    int i, age;
    float total_fee = 0.0;
    float current_fee;
    const int num_people = 6;

    // Loop exactly 6 times (for 6 people)
    for (i = 1; i <= num_people; i++) {
        printf("Enter age for person %d: ", i);
        scanf("%d", &age);

        // --- Fee Calculation Logic (moved inside main) ---
        if (age <= 5) {           // Ages 0-5 (Children)
            current_fee = 0.00;
        }
        else if (age <= 17) {   // Ages 6-17 (Youth)
            current_fee = 10.50;
        }
        else if (age <= 64) {   // Ages 18-64 (Adult)
            current_fee = 25.00;
        }
        else {                  // Ages 65+ (Senior)
            current_fee = 15.00;
        }

        total_fee += current_fee;

        printf("  -> Age: %d, Fee: $%.2f\n", age, current_fee);
    }

    printf("** Total Admission Fee for %d people: $%.2f **\n", num_people, total_fee);

    return 0;
}