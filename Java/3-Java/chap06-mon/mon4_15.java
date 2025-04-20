
public class mon4_15 {
	public static void main (String[]args) {
		//インスタンス生成
		Rectangle add1=new Rectangle(12.3, 25.00);
		double out_area=add1.getArea();
		
		System.out.println("四角の戻り値の面積："+out_area);
		
		Rectangle add2=new Rectangle(14.5, 26.00);
		double out_triarea=add2.getTriArea();
		
		System.out.println("三角の戻り値の面積："+out_triarea);
		
		Rectangle add3=new Rectangle(4);
		double out_cirarea=add3.getCirArea();
		
		System.out.println("丸の戻り値の面積："+out_cirarea);
	}
}
