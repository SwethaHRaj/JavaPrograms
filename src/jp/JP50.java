                                            
package jp;

import java.util.Scanner;

public class JP50 {

	static int called(int n) {
		int d,sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
		
	}

	public static void main(String[] args) {	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to find SUM OF FIRST N NATURAL NUMBERS");
		int n=sc.nextInt();
		
		int rec=called(n);
		System.out.println("SUM OF FIRST N NATURAL NUMBERS "+rec);
		
			
	}
} 