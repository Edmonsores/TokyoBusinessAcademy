
public class VirtualPet {
	    String name;
	    int maxEnergy;
	    int energy;

	    VirtualPet(String name, int maxEnergy, int energy) {
	        this.name = name;
	        this.maxEnergy = maxEnergy;
	        this.energy = energy;
	    }

	    void sleep() {
	        System.out.println(this.name + "：よく寝た。体力が回復したよ。");
	        this.energy = this.maxEnergy;
	        // 現在の体力の値を最大体力の値にする
	    }

	    void printInfo() {
	        System.out.println("【状態出力】");
	        System.out.println("名前：" + this.name);
	        System.out.println("最大体力：" + this.maxEnergy);
	        System.out.println("体力：" + this.energy);
	    }

	    void move() {

	    }
}
