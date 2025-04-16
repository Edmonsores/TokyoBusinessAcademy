import java.util.Scanner;
public class Section4_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("月の季節をチェックしてみよう");
		System.out.println("月番号のみを入力してください。");
		int month = in.nextInt();
		in.close();
		switch (month) {
		case 1:
			System.out.println("季節は冬です。");
			break;
		case 2:
			System.out.println("季節は冬です。");
			break;
		case 3:
			System.out.println("季節は春です。");
			break;
		case 4:
			System.out.println("季節は春です。");
			break;
		case 5:
			System.out.println("季節は春です。");
			break;
		case 6:
			System.out.println("季節は梅雨です。");
			break;
		case 7:
			System.out.println("季節は夏です。");
			break;
		case 8:
			System.out.println("季節は夏です。");
			break;
		case 9:
			System.out.println("季節は秋です。");
			break;
		case 10:
			System.out.println("季節は秋です。");
			break;
		case 11:
			System.out.println("季節は秋です。");
			break;
		case 12:
			System.out.println("季節は冬です。");
			break;
		default:
			System.out.println("想定されていない月番号です");
		}
	}

}
