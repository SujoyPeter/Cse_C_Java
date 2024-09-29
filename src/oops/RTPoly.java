package oops;
class Bike {
	 void run() {
		System.out.println("Hello From Bike");
	}
}
class BMW extends Bike{
	@Override //Annotations
	void run() {
		System.out.println("This is BMW GSA");
	}
}
public class RTPoly {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike a = new BMW();
		a.run();
	}

}
