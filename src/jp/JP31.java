
package jp;

import java.util.Scanner;

public class JP31 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to Print Odd number within");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2!=0)
				System.out.print(i+" ");
		}
	}
}
 