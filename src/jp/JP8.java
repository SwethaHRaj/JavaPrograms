package jp;

import java.util.Scanner;

public class JP8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two integer numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int big=a;
		if(b>big)
			big=b;
		System.out.println("Biggest o two integer numbers is "+big);
		
	}

}
 