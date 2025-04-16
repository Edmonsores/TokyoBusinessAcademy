
public class mon_07 {
	public static void main(String[] args) {
		int[] TBL = {10, 95, 23, 45, 87, 63, 10, 40, 60, 85, 33, 26, 97, 71, 55};

        int count = 0;
        System.out.println("ーー4の倍数の数ーー");
        for (int i = 0; i < TBL.length; i++) {
            if (TBL[i] % 4 == 0) {
                count++;
                System.out.print(TBL[i]+" ");
            }
        }
        System.out.println("\n4の倍数の数:" + count);
        System.out.println("ーーインデックスが3の倍数の値ーー):");

        for (int i = 3; i < TBL.length; i=i+3) {
            if (i % 3 == 0) {
                System.out.println("TBL[" + i + "]=" + TBL[i]);
            }
        }
    }

}
