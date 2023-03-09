package jp;

import java.util.Scanner;

public class JP12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers"); //53
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1>n2)
			System.out.println("Biggest is "+n1);
		else
			System.out.println("Biggest is "+n2);		
	}

}
 
