import java.util.Scanner;
public class Section4_3 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("3つの整数値を入力してください。");
	int A=in.nextInt();
	int B=in.nextInt();
	int C=in.nextInt();
	in.close();
	int min1;
	int min2;
	int min3;
	
	if (A <= B && A <= C) {
        if (B <= C) {
        	min1 = A;
        	min2 = B;
        	min3 = C;
            System.out.println("１番小さい値：" + min1);
            System.out.println("２番目に小さい値：" + min2);
            System.out.println("３番目に小さい値：" + min3);
        } else {
        	min1 = A;
        	min2 = C;
        	min3 = B;
            System.out.println("１番小さい値：" + min1);
            System.out.println("２番目に小さい値：" + min2);
            System.out.println("３番目に小さい値：" + min3);
        }
    }
    else if (B <= A && B <= C) {
        if (A <= C) {
        	min1 = B;
        	min2 = A;
        	min3 = C;
            System.out.println("１番小さい値：" + min1);
            System.out.println("２番目に小さい値：" + min2);
            System.out.println("３番目に小さい値：" + min3);
        } else {
        	min1 = B;
        	min2 = C;
        	min3 = A;
            System.out.println("１番小さい値：" + min1);
            System.out.println("２番目に小さい値：" + min2);
            System.out.println("３番目に小さい値：" + min3);
        }
    }
    else {
        if (A <= B) {
        	min1 = C;
        	min2 = A;
        	min3 = B;
            System.out.println("１番小さい値：" + min1);
            System.out.println("２番目に小さい値：" + min2);
            System.out.println("３番目に小さい値：" + min3);
        } else {
        	min1 = C;
        	min2 = B;
        	min3 = A;
            System.out.println("１番小さい値：" + min1);
            System.out.println("２番目に小さい値：" + min2);
            System.out.println("３番目に小さい値：" + min3);
        }
    }
}
}