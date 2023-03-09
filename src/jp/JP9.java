package jp;

import java.util.Scanner;

public class JP9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two digit number"); //53
		int n=sc.nextInt();
		int a=n/10;
		int b=n%10;
		int res=a+b+a*b;
		if(res==n)
			System.out.println("Special two digit number");
		else
			System.out.println("Not Special two digit number");		
	}

}
 