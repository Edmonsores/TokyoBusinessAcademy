
public class kakunin_04 {
	public static void main(String[] args) {
		int[] TBL = {100,95,23,45,87,63,10,40,60,85};
		for(int i=0; i< TBL.length; i++) {
			System.out.println(TBL[i]);
		}
		int sum = 0;
		int max =TBL[0];
		int min =TBL[0];
		for (int i = 0; i < TBL.length; i++) {
            sum += TBL[i];
            if (TBL[i] > max) {
                max = TBL[i];
            }
            if (TBL[i] < min) {
                min = TBL[i];
            }
        }
		double avg=sum/TBL.length;
		System.out.println("合計は"+sum);
		System.out.println("平均は"+avg);
		System.out.println("最大値は"+max);
		System.out.println("最小値は"+min);
	}	
}
