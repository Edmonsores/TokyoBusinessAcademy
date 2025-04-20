
public class ensyu07＿03 {


    public static int med(int X, int Y, int Z) {
        if ((X > Y && X < Z) || (X < Y && X > Z)) {
            return X; // Xが中央値
        } else if ((Y > X && Y < Z) || (Y < X && Y > Z)) {
            return Y; // Yが中央値
        } else {
            return Z; // Zが中央値
        }
    }

    public static void main(String[] args) {
        // テスト用の値
        int X = 5;
        int Y = 5;
        int Z = 5;

        // 中央値を求める
        int result = med(X, Y, Z);
        
        System.out.printf("X:"+X+", Y:"+Y+", Z:"+Z+" の中央値は:"+result);
    }
}
