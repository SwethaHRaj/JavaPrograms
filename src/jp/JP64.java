                                            
package jp;

import java.util.Scanner;

public class JP64 {
	
	
	static boolean isPerfect(int n) {
		int sum=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
			sum=sum+i;
		}
		return (sum==n);
	}
	
	static void called(int n) {
		int sum=0;
		for(int i=2;i<=n;i++) {
			if(isPerfect(i))
				sum=sum+i;
			}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to PRINT FIRST N PRIMES ");
		int n=sc.nextInt();
		called(n);

	}
} 