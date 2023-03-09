
package jp;

import java.util.Scanner;

public class JP25 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Four Subject Marks");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		float n=(a+b+c+d)/4;
		if(a<35||b<35||c<35||d<35)
			System.out.println("Fail");
		else if(n>=85)
			System.out.println("Distinction");
		else if(n>=75)
			System.out.println("First Class");
		else if(n>=60)
			System.out.println("Second Class");
		else 
			System.out.println("Pass");
	}

}
 