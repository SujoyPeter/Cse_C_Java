package oops;
interface printable{
	void show();
}
interface  shoable{
	void tshow();
}
class CseC {
	void cse() {
		System.out.println("Inside cse");
	}
}
class Cse extends CseC implements printable,shoable{
	public void show() {
		System.out.println("hello from show");
	}
	public void tshow() {
		System.out.println("Hello from shoable");
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cse a = new Cse();
		a.cse();
		a.show();
		a.tshow();
	}

}
