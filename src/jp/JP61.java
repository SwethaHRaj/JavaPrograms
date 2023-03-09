                                            
package jp;

import java.util.Scanner;

public class JP61 {
	
	static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	static int called(int n){	 
		int count=0;
		for(int i=2;i<=n;i++) {
			if(isPrime(i))
				count++;
		}
		return count;
	}
	
	
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find NUMBER OF PRIMES WITHIN");
		int n=sc.nextInt();
		int rec=called(n);
		System.out.println(rec+" PRIMES");
	}
} 