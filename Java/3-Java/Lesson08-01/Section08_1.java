
public class Section08_１ {
	    public static void main(String[] args) {
	        Car car = new Car(1234, 20.5);
	        car.setSpeed(60);

	        Airplane airplane = new Airplane(232);
	        airplane.setSpeed(500);

	        car.show();
	        airplane.show();
	    }
	}

	// Abstract superclass
	abstract class vehicle {
	    protected int speed;

	    public void setSpeed(int s) {
	        speed = s;
	        System.out.println("速度を" + speed + "にしました。");
	    }

	    public abstract void show();
	}

	// Car subclass
	class Car extends vehicle {
	    int number;
	    double gasoline;

	    public Car(int number, double gasoline) {
	        this.number = number;
	        this.gasoline = gasoline;
	        System.out.println("ナンバー" + number + "ガソリン量" + gasoline + "の車を作成しました。");
	    }

	    @Override
	    public void show() {
	        System.out.println("車のナンバーは" + number + "です。");
	        System.out.println("ガソリン量は" + gasoline + "です。");
	        System.out.println("速度は" + speed + "です。");
	    }
	}

	// Airplane subclass
	class Airplane extends vehicle {
	    int flight;

	    public Airplane(int flight) {
	        this.flight = flight;
	        System.out.println("便" + flight + "の飛行機を作成しました。");
	    }

	    @Override
	    public void show() {
	        System.out.println("飛行機の便は" + flight + "です。");
	        System.out.println("速度は" + speed + "です。");
	    }

}
