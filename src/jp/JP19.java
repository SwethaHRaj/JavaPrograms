
package jp;

import java.util.Scanner;

public class JP19 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Year");
		int n=sc.nextInt();
		if(n%400==0 || n%4==0  && n%100!=0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
	}
}
 