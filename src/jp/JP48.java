
package jp;

import java.util.Scanner;

public class JP48 {

	static int factorial(int n) {
		int d,sum=0;
		while(n!=0) {
			d=n%10;
			sum+=d;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to find SUM OF DIGITS");
		int n=sc.nextInt();
		
		int rec=factorial(n);
		System.out.println("SUM OF DIGITS IS "+rec);
		
			
	}
} 