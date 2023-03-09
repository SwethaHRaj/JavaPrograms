                                            
package jp;

import java.util.Scanner;

public class JP53 {

	static int called(int n) {
		int d,count=0;
		do {
			d=n%10;
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}

	public static void main(String[] args) {	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to DIGITS PRESENT");
		int n=sc.nextInt();
		
		int rec=called(n);
		System.out.println("DIGITS PRESENT = "+rec);
	}
} 