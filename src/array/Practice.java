package array;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value on n");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter 1st array Ele");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter value on n");
		int n1=sc.nextInt();
		int[] b=new int[n1];
		System.out.println("Enter 2nd array Ele");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		int[] c=merge(a,b);            
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}
		
	static int[] merge(int[] a,int[] b) {
		int[] c=new int[a.length+b.length];
		for(int i=0;i<c.length;i++) {
			if(i<a.length) 
				c[i]=a[i];
			else
				c[i]=b[i-a.length];
		}
		return c;		
	}	
}

