
package jp;

import java.util.Scanner;

public class JP27 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to find FACTORIAL");
		int n=sc.nextInt();
		long fact=1;
		for(long i=2;i<=n;i++) {
			fact*=i;
		}
		System.out.println("Factorial is "+fact);
	}

}
 