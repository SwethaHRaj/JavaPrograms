
package jp;

import java.util.Scanner;

public class JP41 {

	public static void main(String[] args) {		//continue
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to find Sum of square of its digits");
		int n=sc.nextInt();
		
		int d,sum=0;
		while(n!=0) {
			d=n%10;
			sum=sum+d*d;
			n=n/10;
		}
		System.out.println(sum);
			
	}
} 