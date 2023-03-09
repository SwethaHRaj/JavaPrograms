package multidim;

import java.util.Scanner;

public class M18 {
	
	
	public static void main(String[] args) {
		
		int[][] a=read();
		print(a);
		int[] rec=called(a);
		for(int i=0;i<rec.length;i++)
			System.out.print(rec[i]+" ");
	}

	public static int[] called(int[][] a){
		int pbig=0,sbig=0;
		for(int i =0;i<a[0].length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j)
					if(a[i][j]>pbig)
						pbig=a[i][j];
				if(i+j==a.length-1)
					if(a[i][j]>sbig)
						sbig=a[i][j];
			}
		}
		int[] send= {pbig,sbig};
		return send;
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
	
	
	