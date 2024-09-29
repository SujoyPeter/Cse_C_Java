package questions;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b [][] = {{1,2,3},{4,5,6},{7,8,9}};
int a [][] = {{10,11,12},{13,14,15},{16,17,18}};
int c [][] = new int[3][3];
	for(int i =0; i<c.length;i++) {
		for(int j =0; j<c.length;j++) {
			c[i][j]= a[i][j] + b[i][j];
		}
	}
		for(int i =0; i<b.length;i++) {
			for(int j =0; j<b.length;j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
