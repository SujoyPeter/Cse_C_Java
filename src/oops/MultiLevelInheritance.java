package oops;
class BabyDog extends Dog{
	void weep() {
		System.out.println("Inside baby dog");
	}
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog b = new BabyDog();
		b.weep();
		b.bark();
		b.eat();
	}

}
