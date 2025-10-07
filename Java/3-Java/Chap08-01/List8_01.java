class Car {
	private int speed;
	int gass = 0;

	public void speedUp(int up) {
		speed = up;
		if (speed < 80) {
			speed++;
		}
	}

	public void speedDown() {
		if (speed > 0) {
			speed--;
		}
	}

	public void printspeed() {
		System.out.println("speed=" + speed);
	}
}

public class List8_01 {
	public static void main(String[] args) {
		Car car = new Car();

		//car.speed(30);
		car.gass += 1;

		car.speedUp(30);
		car.speedDown();
		car.printspeed();
	}
}
