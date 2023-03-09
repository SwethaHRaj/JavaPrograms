
package jp;

import java.util.Scanner;

public class JP15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Marks Of Four Subjects");
		int p=sc.nextInt();
		int c=sc.nextInt();
		int m=sc.nextInt();
		int b=sc.nextInt();
		if(p<35||c<35||m<35||b<35) 
			System.out.println("Fail");
		else
			System.out.println("Pass");	
		
		/*
		if(p>=35 && c>=35 && m>=35 && b>=35)
			System.out.println("Pass");
		else
			System.out.println("Fail");	
		*/
	}

}
 