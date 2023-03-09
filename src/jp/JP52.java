                                            
package jp;

import java.util.Scanner;

public class JP52 {

	static int called(int n) {
		int count=2;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				count++;
		}
		return count;
	
	}

	public static void main(String[] args) {	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to DIVISORS COUNT");
		int n=sc.nextInt();
		
		int rec=called(n);
		System.out.println("DIVISORS COUNT IS "+rec);
	}
} 