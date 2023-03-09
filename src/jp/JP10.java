package jp;

import java.util.Scanner;

public class JP10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to check negative or positive"); 
		int n=sc.nextInt();
		if(n<0)
			System.out.println("Neagitive Number");
		else if(n>0)
			System.out.println("Positive Number");	
		else
			System.out.println("Number is Neutral");
	}

}
 