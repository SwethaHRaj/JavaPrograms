                                            
package jp;

import java.util.Scanner;

public class JP62 {
	
	static int isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return 0;
		}
		return n;
	}
	
	static int called(int n){	 
		int sum=0;
		for(int i=2;i<=n;i++) {
				sum=sum+isPrime(i);
		}
		return sum;
	}
	
	
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find SUM OF PRIMES WITHIN");
		int n=sc.nextInt();
		int rec=called(n);
		System.out.println(rec+" is sum of PRIMES");
	}
} 