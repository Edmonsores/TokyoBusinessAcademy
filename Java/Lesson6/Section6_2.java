import java.util.Scanner;
public class Section6_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("身長と標準体重の対応表を作ろう‼");
	        System.out.print("何ｃｍから： ");
	        int Height1 = in.nextInt();

	        System.out.print("何ｃｍまで： ");
	        int Height2 = in.nextInt();

	        System.out.print("何ｃｍごと： ");
	        int Heightinterval = in.nextInt();

	        System.out.println("\n身長  標準体重");
	        System.out.println("---------------------");

	        for (int height = Height1; height <= Height2; height += Heightinterval) {
	            double standardWeight = (height - 100) * 0.9;
	            System.out.println(height +"   "+standardWeight);
	        }

	        in.close();
	    }
		
	}

