
package jp;

import java.util.Scanner;

public class JP16 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to check wheather it is a digit or not");
		int n=sc.nextInt();
		if(n>=-9 && n<=9) 
			System.out.println("Digit");
		else
			System.out.println("Not Digit");	
	}

}
 