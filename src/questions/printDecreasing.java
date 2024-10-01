package questions;
import java.util.Scanner;
public class printDecreasing {
static void printDecreaing(int n) {
	if(n==0)return;
	System.out.println(n);
	printDecreaing(n-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		printDecreaing(a);
	}
}
