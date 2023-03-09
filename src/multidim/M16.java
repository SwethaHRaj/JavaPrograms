package multidim;

import java.util.Scanner;

public class M16 {
	
	
	public static void main(String[] args) {
		
		int[][] a=read();
		print(a);
		int[][] rec=called(a);
		print(rec);
	}

	public static int[][] called(int[][] a){
		for(int j=0;j<a[0].length;j++) {
			int l=a.length-1,f=0,temp;
			while(f<l) {
				temp=a[f][j];
				a[f][j]=a[l][j];
				a[l][j]=temp;
				f++;
				l--;
			}
		}
		return a;
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
	
	
	