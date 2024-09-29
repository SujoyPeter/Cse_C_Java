package oops;
public class CompileTimePolymorphism {
	int add(int a , int b) {
		return a+b;
	}
	double add (double a, double b) {
		return a+b;
	}
	int add (int a, int b, int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CompileTimePolymorphism p = new CompileTimePolymorphism();
		System.out.println(p.add(10, 5));
		System.out.println(p.add(5.5, 9));
		System.out.println(p.add(10, 9, 8));
	}

}
