import java.util.Scanner;
public class Arugo05_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int kazu, gokei=0, tosi, cnt=0, ryokin=0;
	    int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0;
	    System.out.println("人数を入力してください:");
	    kazu = in.nextInt();
	    	while (cnt<kazu) {
	    	System.out.println("年齢を入力してください:");
	    	tosi = in.nextInt();
	    	if (tosi <= 3) {
	    		ryokin = 0;
                c1++;
            } else if (tosi >= 4 && tosi <= 12) {
            	ryokin = 500;
            	c2++;
            } else if (tosi >= 13 && tosi <= 18) {
            	ryokin = 800;
            	c3++;
            } else if (tosi >= 19 && tosi < 59) {
            	ryokin = 1000;
            	c4++;
            } else if (tosi >= 60 && tosi <= 80) {
            	ryokin = 700;
            	c5++;
            } else if (tosi >= 81) {
            	ryokin = 300;
            	c6++;
            }
	    	gokei = gokei+ryokin;
	    	cnt++;
            }
	    	in.close();
	        
	        System.out.println("1日の入園料の合計額は " + gokei + " 円です。");
	        System.out.println("3歳以下: " + c1 + " 人");
	        System.out.println("4-12歳まで: " + c2 + " 人");
	        System.out.println("13-18歳まで: " + c3 + " 人");
	        System.out.println("19-59歳未満: " + c4 + " 人");
	        System.out.println("60-80歳まで: " + c5 + " 人");
	        System.out.println("81歳以上: " + c6 + " 人");
	    	
	    }
}
