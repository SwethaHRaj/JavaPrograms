
package jp;

import java.util.Scanner;

public class JP30 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to Print even number within");
		int n=sc.nextInt();
		for(int i=2;i<=n;i+=2) {
			if(i%2==0)
				System.out.print(i+" ");
		}
	}
}
 