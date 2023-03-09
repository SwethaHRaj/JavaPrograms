
package jp;

import java.util.Scanner;

public class JP24 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an Integer Number");
		int n=sc.nextInt();
		if(n%3==0 && n%5==0) 
			System.out.println("Sanju weds Geetha");
		else if(n%3==0)
			System.out.println("Sanju");
		else if(n%5==0)
			System.out.println("Geetha");
		else
			System.out.println("BreakUp");
	}

}
 