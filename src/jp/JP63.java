                                            
package jp;

import java.util.Scanner;

public class JP63 {
	
	static int isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return 0;
		}
		return n;
	}
	
	static void called(int n){	
		int count=1,i=2;	
		while(count<=n) {
			if(isPrime(i)>0) {
				count++;
				System.out.print(i+" ");
			}	
			i++;			
		}
	}
	
	
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to PRINT FIRST N PRIMES ");
		int n=sc.nextInt();
		called(n);

	}
} 