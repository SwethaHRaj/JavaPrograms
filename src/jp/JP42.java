
package jp;

import java.util.Scanner;

public class JP42 {

	public static void main(String[] args) {		//continue
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to find Sum of square of its digits");
		int n=sc.nextInt();
		
		int d,pro=1;
		while(n!=0) {
			d=n%10;
			pro=pro*d;
			n=n/10;
		}
		System.out.println(pro);
			
	}
} 