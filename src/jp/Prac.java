                                            
package jp;

import java.util.Scanner;

public class Prac {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		printPrime(n);
	}
	
	static void printPrime(int n) {
		int count=0,i = 2;
		while(count<n) {
			if(isPrime(i)) {
				count++;
				System.out.print(i+" ");
			}
			i++;
		}
		
	}
   boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	
}
	