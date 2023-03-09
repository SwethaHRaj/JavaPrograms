
package jp;

import java.util.Scanner;

public class JP33 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to find divisible numbers");
		int n=sc.nextInt();
		int count=2;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
			count++;
		}
		System.out.println("Number of divisors are "+count);
	}
} 
