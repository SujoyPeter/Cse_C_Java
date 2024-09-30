package introduction;
public class Recursion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
	}
	static int count =0;
 public static void print() {
	 count++;
	 if(count<=5) {
	 System.out.println("hello " + count);
	 print();
	 }
 }
}
