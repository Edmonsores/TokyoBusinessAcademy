import java.util.Scanner;
public class review_01 {
	public static String Nofunction(int no) {
	String moji;
	if (no == 1) {
	    moji = "テニス";
	}else if(no == 2) {
		moji = "野球";
	}else if(no == 3) {
		moji = "バレーボール";
	}else if(no == 4) {
		moji = "新体操";
	}else {
		moji = "エラー";
	}
	return moji;
	}
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 for(int i= 0; i < 3; i++) {
	            System.out.print("名前を入力してください: ");
	            String name = in.next();
	            
	            System.out.print("グループ番号を入力してください (1-4): ");
	            int no = in.nextInt();

	            String groupName = Nofunction(no);
	            System.out.println(name + "さんのグループは " + groupName + " です。");
	            System.out.println("");
		 }
		 in.close();	
	}
	
}
