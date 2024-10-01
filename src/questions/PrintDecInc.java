package questions;

import java.util.Scanner;

public class PrintDecInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		pDI(a);
	}
	 static void pDI(int n) {
		 if(n==0)return;
		 System.out.println(n);
		 pDI(n-1);
		 System.out.println(n);
	 }
}
