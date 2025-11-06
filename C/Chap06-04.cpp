#include<stdio.h>
int main() {
	int i;
	for (i = i; i <= 20; i++) {
		if (i % 3 == 0) {
			continue;
		}
		printf("i=%d\n",i);
	}
	printf("I—¹\n");
	printf("i=%d\n", i);

	return 0;
}