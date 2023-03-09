package jp;

import java.util.Scanner;

public class JP11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers"); //53
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1==n2)
			System.out.println("Numbers are equal");
		else
			System.out.println("Numbers are not equal");		
	}

}
 