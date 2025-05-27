/*
 * p-198 実行ファイル（メインメソッド）
 */
public class List7_03 {
	public static void main(String [] args) {
		//インスタンス生成はサブクラス名
		IStudentCard a = new IStudentCard();
		a.id = 2345;
		a.name = "John Smith";
		a.nationality = "イギリス";
		
		a.printInfo();
		
	}

}
