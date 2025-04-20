import java.util.Scanner;
public class Review_001 {
	public static String Nofunction(int groupNo) {
		switch(groupNo){
			case 1:
				return "テニス";
			case 2:
				return "野球";
			case 3:
				return "バレーボール";
			case 4:
				return "新体操";
			default:
				return "エラー";
		}
	}
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 for(int i= 0; i < 3; i++) {
	            System.out.print("名前を入力してください: ");
	            String name = in.next();
	            
	            System.out.print("グループ番号を入力してください (1-4): ");
	            int groupNo = in.nextInt();

	            String groupName = Nofunction(groupNo);
	            System.out.println(name + "さんのグループは " + groupName + " です。");
	            System.out.println("");
		 }
		 in.close();	
	}
	
}
