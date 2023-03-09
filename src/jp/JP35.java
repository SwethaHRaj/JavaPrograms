
package jp;

import java.util.Scanner;

public class JP35 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to print all divisors of 3 within n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%3==0)
				System.out.print(i+" ");
		}
	}
} 