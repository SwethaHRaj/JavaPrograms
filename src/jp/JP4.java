package jp;

import java.util.Scanner;

public class JP4 {

	public static void main(String[] args) {
		System.out.println("Enter value of Principal amopunt in Rs., Term in years, Annual Rate of interest in percentage in Order"); 
		Scanner sc=new Scanner(System.in);
		double p=sc.nextDouble();
		double t=sc.nextDouble();
		double r=sc.nextDouble();
		double si=p*t*r/100;
		System.out.println("Simple interset is "+si);
	}

}
 