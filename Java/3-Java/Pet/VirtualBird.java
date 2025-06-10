
public class VirtualBird extends VirtualPet { 
    VirtualBird(String name, int maxEnergy, int energy) {
        super(name, maxEnergy, energy);
    }

    void fly() { 
        if (this.energy < 10) {
            System.out.println(this.name + "バタバタ。飛んだ。体力が10減った。最大体力が1増えた。");
            this.energy -= 10; 
            this.maxEnergy++; 
        } else {
            System.out.println(this.name + "バタバタ。飛んだ。体力が10減った。最大体力が1増えた。"); 
            this.energy -= 10;
            this.maxEnergy++;
        }
    }
}

