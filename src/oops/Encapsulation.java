package oops;
 class Student{
	private String name = "Sujoy Peter";
	public String getName() {
		return name;
	}
	public void setName(String input) {
		this.name = input;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setName("Tejashree");
		System.out.println(s.getName());
	}

}
