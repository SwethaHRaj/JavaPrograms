
package jp;

import java.util.Scanner;

public class JP18 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Month Number to check how many days");
		int n=sc.nextInt();
		if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12)
			System.out.println("31 Days");
		else if(n==4 || n==6 || n==9 || n==11)
			System.out.println("30 Days");
		else if(n==2)
			System.out.println("28 or 29 Days");
		else
			System.out.println("Invalid Input");
	}

}
 