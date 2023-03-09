
package jp;

import java.util.Scanner;

public class JP21 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter one integer");
		int a=sc.nextInt();
		if((a>=-99 && a<-9) || (a>9 && a<=99))
			System.out.println("Two digit number");
		else 
			System.out.println("Not a two digit number");
	}
}
 