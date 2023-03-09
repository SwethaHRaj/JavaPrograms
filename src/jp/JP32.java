

package jp;

import java.util.Scanner;

public class JP32 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to print all Numbers between n to 1");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			System.out.print(i+" ");
		}
	}
} 

