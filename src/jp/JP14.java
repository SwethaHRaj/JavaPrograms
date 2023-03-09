
package jp;

import java.util.Scanner;

public class JP14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age of person to check whether eligible for voting or not");
		int n=sc.nextInt();
		if(n>=18)
			System.out.println("Eligible for Voting");
		else
			System.out.println("Not Eligible for Voting");		
	}

}
 