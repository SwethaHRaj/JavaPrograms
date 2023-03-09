
package jp;

import java.util.Scanner;

public class JP36 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to find sum of digits");
		int n=sc.nextInt();
		int d,sum=0;
		while(n!=0) {
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println(sum);
	}
} 