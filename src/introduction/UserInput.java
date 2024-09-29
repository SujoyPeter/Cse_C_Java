package introduction;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no 1");
		int a = sc.nextInt();
		System.out.println("Enter no 2");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Addition of two no is "+ c);
	}

}
