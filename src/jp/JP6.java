package jp;

import java.util.Scanner;

public class JP6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two double type values");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println("sum is "+(a+b));
		System.out.println("Difference is "+(a-b));
		System.out.println("Product is "+a*b);
		System.out.println("Quotient is "+a/b);	
	}

}
 