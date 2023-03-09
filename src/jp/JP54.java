                                            
package jp;

import java.util.Scanner;

public class JP54 {

	static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	static boolean called(int n) {
		int temp=n,d,sum=0;
		while(n!=0) {
			d=n%10;
			sum=sum+factorial(d);                                            
			n=n/10;
		}
		if(temp==sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to DIGITS PRESENT");
		int n=sc.nextInt();
		
		boolean rec=called(n);
		if(rec)
			System.out.println("STRONG NUMBER");
		else
			System.out.println("NOT STRONG NUMBER");
	}
} 