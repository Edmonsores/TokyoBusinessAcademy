
public class List3_03 {
	public static void main (String [] args) {
		int age;
		age =20;
		//分岐処理　条件１　条件２
		if (age < 4) {
			//条件１(YES)の時
			System.out.println("入場料は無料です。");
		}else if (age < 13) {
			//条件２(YES)の時
			System.out.println("子供料金で入場できます。");
			//条件１(NO)であり条件２(NO)の時
		}else {
			System.out.println("大人料金が必要です。");
		}
	}	
}

