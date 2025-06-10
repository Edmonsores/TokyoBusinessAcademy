
public class VirtualPetGame {
	   public static void main(String[] args) {
		   VirtualDog taro = new VirtualDog("タロ", 100, 50);
		   VirtualBird piyo = new VirtualBird("ピヨ", 60, 30);
		   VirtualCat neko = new VirtualCat("ネコ", 80, 30);


		   piyo.sleep();
		   taro.sleep();
		   neko.sleep();
		   
           System.out.println(" ");
		   taro.walk();
	       piyo.fly();
		   neko.scratch();

		   
           System.out.println(" ");
	       taro.printInfo();
	       piyo.printInfo();
	       neko.printInfo();
	    }
}
