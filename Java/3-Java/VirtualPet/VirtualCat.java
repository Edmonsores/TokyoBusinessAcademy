
public class VirtualCat extends VirtualPet{
    VirtualCat(String name, int maxEnergy, int energy) {
        super(name, maxEnergy, energy);
    }

    void move() {
        if (this.energy < 15) {
            System.out.println(this.name + "：疲れちゃって、また寝ますね。");
        } else {
            System.out.println(this.name + "に顔をひっかかれた。最大体力が1増えた。。");
            this.energy -= 15;
            this.maxEnergy += 2;
        }
    } 

}
