                                            
package jp;

import java.util.Scanner;

public class JP51 {

	static boolean called(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)	
				sum=sum+i;
		}
		if(sum==n)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to find SUM OF FIRST N NATURAL NUMBERS");
		int n=sc.nextInt();
		
		boolean rec=called(n);
		if(rec)
			System.out.println("PERFECT ");
		else
			System.out.println("NOT PERFECT");
	}
} 