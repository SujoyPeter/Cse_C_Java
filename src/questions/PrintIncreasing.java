package questions;

import java.util.Scanner;

public class PrintIncreasing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		printIncreasing(a);
	}
	public static void printIncreasing(int n ) {
		if(n==0)return;
		printIncreasing(n-1);
		System.out.println(n);
	}
}
