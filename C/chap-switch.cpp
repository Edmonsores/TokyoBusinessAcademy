/*
switch
*/
#include<stdio.h>
int main() {
	int number;
	printf("”Ô†‚ğ“ü—Í„");
	scanf("%d", &number);

	switch (number) {
	case 1:
		printf("”Ô†‚Í%d‚Å‚·",number);
		break;
	case 2:
		printf("”Ô†‚Í%d‚Å‚·", number);
		break;
	case 3:
		printf("”Ô†‚Í%d‚Å‚·", number);
		break;
	default:
		printf("”Ô†‚ÍƒGƒ‰[‚Å‚·", number);
		break;
	}
	return 0;
}