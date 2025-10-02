#include <stdio.h>

int main() {
	printf("%d\n", 30 + 5 * 2);
	printf("%d\n", (30 + 5) * 2);
	printf("%.2f\n", 1.0 / (60.0 / 15.0));
	printf("%.0f•ª‚Í%.2fŠÔ‚Å‚·B\n", 15.0, 15.0 / 60.0);
	double minutes;
	minutes = 20.0;
	printf("%.0f•ª‚Í%.2fŠÔ‚Å‚·B", minutes, minutes / 60.0);
}