
package jp;

import java.util.Scanner;

public class JP13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to check even or odd"); //53
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println(n+" is Even");
		else
			System.out.println(n+" is Odd");		
	}

}
 