
public class mogi_04 {
	public static void main(String[] args) {
		int[] TBL = {10, 95, 23, 45, 87, 63, 10, 40, 60, 85, 33, 26, 97, 71, 55};

        int countMultiplesOf4 = 0;
        System.out.println("TBL内の4の倍数の値:");

        for (int i = 0; i < TBL.length; i++) {
            if (TBL[i] % 4 == 0) {
                System.out.println("TBL[" + i + "] = " + TBL[i]);
                countMultiplesOf4++;
            }
        }

        System.out.println("TBL内の4の倍数である値の数:" + countMultiplesOf4);
        
        System.out.println("\nTBLのインデックスが3の倍数である値(インデックス0は含みません):");

        for (int i = 1; i < TBL.length; i++) {
            if (i % 3 == 0) {
                System.out.println("TBL[" + i + "] = " + TBL[i]);
            }
        }
    }	
}

