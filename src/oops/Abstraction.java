package oops;
abstract class Bike1{
	abstract void run();
	void color() {
		System.out.println("Color is Black");
	}
}
class Honda extends Bike1{
	void run() {
		System.out.println("This is AfricaTwin");
	}
}
public class Abstraction {
	public static void main(String[] args) {
		Honda a = new Honda();
		a.run();
		a.color();
	}

}
