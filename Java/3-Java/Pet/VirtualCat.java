
public class VirtualCat extends VirtualPet{
	VirtualCat(String name, int maxEnergy, int energy) {
	        super(name, maxEnergy, energy);
	    }

	    void scratch() {
	        if (this.energy < 10) {
	            System.out.println(this.name + "は、疲れちゃって、	また寝ますね。");
	        } else {
	            System.out.println(this.name + "に顔をひっかかれた。最大体力が1増えた。");
	            this.energy -= 10;
	            this.maxEnergy++;
	        }
	    }
}
