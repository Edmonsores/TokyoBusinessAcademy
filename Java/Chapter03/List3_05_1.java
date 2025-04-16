import java.util.Scanner;
public class List3_05_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("年齢を入力してください:");
		int A = in.nextInt();
		if(A>=20 && A<=35){
		  if(A==30){
		    System.out.print("取消の値です。");
		  } else {
			  System.out.print("正常値入力。");
		  }
		} else {
			System.out.print("入力エラー。");
		}
		 in.close();
	}
}

