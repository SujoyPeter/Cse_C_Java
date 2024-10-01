package questions;
import java.util.Scanner;
public class TOH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		toh(a,10,11,12);
	}
 static void toh(int n,int S, int D, int H) {
	 if (n == 0) return;
	 toh(n-1,S,H,D);
	 System.out.println(S + " => " + D + " => " +n);
	 toh(n-1,H,D,S);
 }
}
