
package jp;

import java.util.Scanner;

public class JP43 {

	public static void main(String[] args) {		//continue
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to find Sum of even and odd digits");
		int n=sc.nextInt();
		
		int d,es=0,os=0;
		while(n!=0) {
			d=n%10;
			if(d%2==0)
				es=es+d;
			else
				os=os+d;
			n=n/10;
		}
		System.out.println("even sum = "+es+"\nOdd sum  = "+os);
			
	}
} 