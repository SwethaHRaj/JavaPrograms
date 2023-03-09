
package jp;

import java.util.Scanner;

public class JP17 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Month Number to check whether it is a valid or not");
		int n=sc.nextInt();
		if(n>=1 && n<=12) 
			System.out.println("Valid Month Number");
		else
			System.out.println("Invalid Month Number");	
	}

}
 