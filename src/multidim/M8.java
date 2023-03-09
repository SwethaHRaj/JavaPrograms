package multidim;

import java.util.Scanner;

public class M8 {
	
	
	public static void main(String[] args) {
		
		int[][] a=read();
		print(a);
		int rec=called(a);
		System.out.println(rec);
	}

	public static int called(int[][] a){
		int small=a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(small>a[i][j])
					small=a[i][j];
			}
		}
		return small;
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
	
	
	