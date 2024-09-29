package oops;
class Grandfather{
	void oldman() {
		System.out.println("Inside GrandFather");
	}
}
class Father extends Grandfather{
	void dad() {
		System.out.println("Inside Father");
	}
}
class Son extends Father{
	void play() {
		System.out.println("Inside Son");
	}
}
class Daughter extends Father{
	void sing() {
		System.out.println("Inside Daughter");
	}
}
public class HybridInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter d = new Daughter();
		d.dad();
		d.oldman();
		d.sing();
	}

}
