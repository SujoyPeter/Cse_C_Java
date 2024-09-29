package introduction;

import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][] a = new int [3][3];
int b [][] = {{10,20,30},{40,50,60},{70,80,90}};
//		a[0][0]= 1;
//		a[0][1]= 2;
//		a[0][2]= 3;
//		a[1][0]= 4;
//		a[1][1]= 5;
//		a[1][2]= 6;
//		a[2][0]= 7;
//		a[2][1]= 8;
//		a[2][2]= 9;
		for(int i =0; i<a.length; i++) {
			for (int j=0; j<a.length;j++) {
				a[i][j]= sc.nextInt();
			}
		}
		System.out.println("Output is");
		for(int i =0; i<a.length; i++) {
			for (int j=0; j<a.length;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
