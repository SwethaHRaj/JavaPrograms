
package jp;

import java.util.Scanner;

public class JP49 {

	static int called(int n) {
		int d,pro=1;
		while(n!=0) {
			d=n%10;
			pro*=d;
			n=n/10;
		}
		return pro;
	}
	public static void main(String[] args) {	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to find PRODUCT OF DIGITS");
		int n=sc.nextInt();
		
		int rec=called(n);
		System.out.println("PRODUCT OF DIGITS IS "+rec);
		
			
	}
} 