
package jp;

import java.util.Scanner;

public class JP26 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to find whether it is PERFECT NUMBER or not");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				sum+=i;
		}
		if(sum==n)
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect Number");
	}

}
 