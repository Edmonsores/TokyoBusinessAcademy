import java.util.Date;
public class fomat_reidai {
	public static void main(String[] args) {
        // 整数の扱い (%d)
        int hoge = 1;
        String str = String.format("変数hogeの中身は%dです。", hoge);
        System.out.println(str);

        // 真偽値の扱い (%b)
        //boolean str1 = true;
        String str1 = String.format("TRUEは%b、FALSEは%b", true, false);
        System.out.println(str1);

        // 文字列の扱い (%s)
        String str2 = String.format("文字列の内容は%s", "HOGE");
        System.out.println(str2);

        // 文字の扱い (%c)
        String str3 = String.format("貴方の評価は%c", 'A');
        System.out.println(str3);

        // 浮動小数点の扱い (%f)
        String str4 = String.format("円周率は%f", 3.1415);
        System.out.println(str4);

        // 日時の扱い (%txx)
        Date date = new Date();
        String date_str = String.format("%tH:%tM", date.getTime(), date.getTime());
        System.out.println(date_str);

        String str5 = String.format("%4d", 10); // 書式付き文字列の生成
        System.out.println(str5);
        
        for(int i = 1; i <=9; i++) {
        	for(int j = 1; j<=9; j++) {
        		System.out.printf("%3d", i * j);
        	}
        	System.out.println();
    }
}
}
