                                            
package jp;

import java.util.Scanner;

public class JP59 {
	
	static String called(int n) {	 
		int temp=n,d,os=0,is=0;
		do {
			d=n%10;
			if(temp==n || n<10)
				os+=d;
			else
				is+=d;
			n=n/10;
		}while(n!=0);
		if(is==os)
			return "xylem";
		else
			return "phloem";
	}
	
	
	public static void main(String[] args) {	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of n to check XYLEM OR PHLOEM");
		int n=sc.nextInt();
		String rec=called(n);
		System.out.println("number is --> "+rec);

	}
} 