
package jp;

import java.util.Scanner;

public class JP22 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three integer numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a<b && a>c)|| (a>b && a<c))
			System.out.println(a +" is middle number");
		else if((b<a && b>c) || (b>a&&b<c))
			System.out.println(b+" is middle number");
		else
			System.out.println(c+" is middle number");
		
	}
}
 