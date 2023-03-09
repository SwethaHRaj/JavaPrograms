package multidim;

import java.util.Scanner;

public class M13 {
	
	
	public static void main(String[] args) {
		
		int[][] a=read();
		print(a);
		int[] rec=called(a);
		for(int i=0;i<rec.length;i++)
			System.out.print(rec[i]+" ");
	}

	public static int[] called(int[][] a){
		int[] cb=new int[a[0].length];
		for(int i=0;i<a[0].length;i++) {
			int cbig=0;
			for(int j=0;j<a.length;j++) {
				if(a[j][i]>cbig)
					cbig=a[j][i];
			}                     
			cb[i]=cbig;
		}
		return cb;
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
	
	
	