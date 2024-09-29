package oops;
class Cat extends Animal{
	void meow() {
		System.out.println("Hello from Cat");
	}
}
public class HyraricalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.meow();
		c.eat();
		Dog d = new Dog();
		d.bark();
		d.eat();
	}

}
