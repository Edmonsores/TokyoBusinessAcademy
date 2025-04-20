import java.util.Scanner;
public class ensyu06_02 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		double [][] score = new double[6][2]; //学生は6人、科目は2つ
		double[] sum = new double[6];  //学生の合計
		double[] avr = new double[6]; //学生の平均
		double sumlanguage = 0;  //国語の合計
		double summath = 0; //数学の合計
		
		for ( int i=0; i<6; i++) {
			System.out.println("学生"+(i+1)+"の点数を入力してください。");
			System.out.println("国語：");
			score[i][0]=scanner.nextDouble();
			System.out.println("数学：");
			score[i][1]=scanner.nextDouble();
			
			sum[i]=score[i][0]+score[i][1];
			avr[i]=sum[i]/2;
			
			sumlanguage +=score[i][0];
			summath +=score[i][1];
			
		}
		System.out.println("学生の点数の結果：");
		for (int i=0; i<6; i++){
			System.out.println("学生"+(i+1)+"：　合計＝"+sum[i]+"　平均＝"+avr[i]);
		}
		double avrlanguage = sumlanguage/6;  //国語の平均
		double avrmath = summath/6; //数学の平均
		
	
		System.out.println();
		System.out.println("科目の点数の結果：");
		System.out.println("国語：　合計＝"+sumlanguage+" 平均＝"+avrlanguage);
		System.out.println("数学：　合計＝"+summath+" 平均＝"+avrmath);
		scanner.close();
	}
}
