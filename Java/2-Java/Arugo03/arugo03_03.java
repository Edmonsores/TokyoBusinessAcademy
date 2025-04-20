public class arugo03_03 {
    public static void main(String[] args) {
        int[] TBL = {34,47,94,72,21,84,66,6,22,64};
        int indexmax;
        int valuemax;
        int j;
        int i;
        for( i = 0;i<9;i++) {
        	indexmax= i;
            for(j=i+1;j<10;j++) {
                if(TBL[j]>TBL[indexmax]) {
                	indexmax=j;
                }
            }
            valuemax=TBL[indexmax];
            TBL[indexmax]=TBL[i];
            TBL[i]=valuemax;
        }
        for(int a = 0; a < 10; a++) {
            if(a < 9) {
                System.out.print(TBL[a] + ",");
            } else {
                System.out.print(TBL[a]);
            }
    }
}
}