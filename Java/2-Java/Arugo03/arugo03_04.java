public class arugo03_04 {
    public static void main(String[] args) {
        int[] TBL = {34,47,94,72,21,84,66,6,22,64};
        int temp;
        int i;
        int last;
        for(last = 9;last>0;last--) {
            for(i=0;i<last;i++) {
                if(TBL[i]>TBL[i+1]) {
                    temp=TBL[i];
                    TBL[i]=TBL[i+1];
                    TBL[i+1]=temp;
                }
            }
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