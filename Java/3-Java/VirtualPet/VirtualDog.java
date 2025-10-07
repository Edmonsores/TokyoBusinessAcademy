
public class VirtualDog extends VirtualPet{
	    VirtualDog(String name, int maxEnergy, int energy) {
	        super(name, maxEnergy, energy);
	    }

	    void move() {
	        // VirtualPetクラスのmoveメソッドをオーバーライドします
	        if (this.energy < 10) {
	            System.out.println(this.name + "：疲れちゃって、これ以上歩けないよ。");
	        } else {
	            System.out.println(this.name + "：歩いたよ。体力が10減った。最大体力が1増えた。");
	            this.energy -= 10;
	            this.maxEnergy++;
	        }
	   }
}
