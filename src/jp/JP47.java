
package jp;

import java.util.Scanner;

public class JP47 {

	static int called(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to find FACTORIAL");
		int n=sc.nextInt();
		
		int fact=called(n);
		System.out.println("factorial is "+fact);
		
			
	}
} 