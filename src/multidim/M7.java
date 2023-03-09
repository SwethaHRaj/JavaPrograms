package multidim;

import java.util.Scanner;

public class M7 {
	
	
	public static void main(String[] args) {
		
		int[][] a=read();
		print(a);
		int[][] rec=called(a);
		print(rec);
	}

	public static int[][] called(int[][] a){
		int[][] c=new int[a[0].length][a.length];
		for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<a.length;j++) {
				c[i][j]=a[j][i];
			}
		}
		return c;
	}
	
	

	static int[][] read() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row length");
		int r=sc.nextInt();
		System.out.println("Enter coloumn length");
		int c=sc.nextInt();
		int[][] a=new int[r][c]; 
		System.out.println("Enter Array Elements");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();				
			}
		}
		return a;
	}
	
	static void print(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
	
	
	