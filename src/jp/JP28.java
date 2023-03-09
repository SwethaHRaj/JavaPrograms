
package jp;

import java.util.Scanner;

public class JP28 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to find sum of N natural numbers");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum of N natural Numbers is "+sum);
	}
}
 