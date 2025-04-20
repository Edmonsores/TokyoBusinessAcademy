
public class Rectangle {
	double width; //幅
	double height; //高さ
	double radius; //半径
	
	//コンストラクタ
	Rectangle (double wid, double hei){
		this.width=wid;
		this.height=hei;
	}	
	Rectangle (double ra){
		this.radius=ra;
	
	}
	
	//getAreaメソッド定義
	double getArea() {
		double area = this.height*this.width;
		
		return area;
	}
	double getTriArea() {
		double triArea = (this.height*this.width)/2;
		
		return triArea;
	}
	
	double getCirArea() {
		double cirArea = this.radius*this.radius*3.14;
		
		return cirArea;
	}

}
