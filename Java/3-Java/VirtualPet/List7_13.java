
public class List7_13 {
    public static void moveAndSleep(VirtualPet pet) {
        pet.move();
        pet.sleep();
    }

    public static void main(String[] args) {
        VirtualDog taro = new VirtualDog("タロ", 100, 50);
        VirtualBird piyo = new VirtualBird("ピヨ", 60, 30);
        VirtualCat neko = new VirtualCat("ネコ", 130, 60); 
        
        moveAndSleep(taro);
        moveAndSleep(piyo);
        moveAndSleep(neko); 
    }
}
