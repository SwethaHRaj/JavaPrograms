
package jp;

import java.util.Scanner;

public class JP45 {

	public static void main(String[] args) {		//continue
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to REVERSE");
		int n=sc.nextInt();
		
		int d,rev=0;
		do{      
			d=n%10;
				rev=rev*10+d;
			n=n/10;
		}while(n!=0) ;
		System.out.println("Reverse is "+rev);
			
	}
} 