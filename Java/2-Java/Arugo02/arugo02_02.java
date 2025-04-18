
public class arugo02_02 {
    public static void main(String[] args) {

        char[] MOJI = new char[30]; 
        
        MOJI[0] = 'A'; MOJI[1] = 'B'; MOJI[2] = 'A'; MOJI[3] = 'C';  MOJI[4] = 'D'; MOJI[5] = 'A'; MOJI[6] = 'E'; MOJI[7] = 'F';
        MOJI[8] = 'G'; MOJI[9] = 'A'; MOJI[10] = 'H'; MOJI[11] = 'I'; MOJI[12] = 'J'; MOJI[13] = 'K'; MOJI[14] = 'L'; MOJI[15] = 'A';
        MOJI[16] = 'M'; MOJI[17] = 'N'; MOJI[18] = 'O'; MOJI[19] = 'P'; MOJI[20] = 'A'; MOJI[21] = 'Q'; MOJI[22] = 'R'; MOJI[23] = 'S';
        MOJI[24] = 'T'; MOJI[25] = 'U'; MOJI[26] = 'V'; MOJI[27] = 'W'; MOJI[28] = 'X'; MOJI[29] = 'A'; 
        
        int count = 0;
        
        for (int i = 0; i < MOJI.length; i++) {
            if (MOJI[i] == 'A') {
                count++;
            }
        }
        
        if (count > 0) {
            System.out.println("Aの文字は " + count + " 回見つかりました。");
        } else {
            System.out.println("Aの文字は含まれていません。");
        }
    }
}
