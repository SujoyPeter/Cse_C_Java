package introduction;
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[5];
		int []b = {44,34,24,23,21};
		Scanner sc = new Scanner(System.in);
//		a[0]= 20;
//		a[1]= 25;
//		a[2]= 30;
//		a[3]= 35;
//		a[4]= 40;
//		a[5]= 45;
//		System.out.println(a[2]);
		for(int i =0; i<a.length;i++) {
			a[i]= sc.nextInt();
		}
		System.out.println("Output Array: ");
		for(int i =0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
