
package jp;

import java.util.Scanner;

public class JP37 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to count number of digits");
		int n=sc.nextInt();
		int count=0;
		do{
			count++;
			n=n/10;
		}while(n!=0);
		System.out.println(count);
	}
} 