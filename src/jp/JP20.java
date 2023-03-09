
package jp;

import java.util.Scanner;

public class JP20 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Three integer values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int small;
		if(b<a && b<c)
			small=b;
		else if(c<a && c<b)
			small=c;
		else 
			small=a;
		System.out.println("Smallest is "+small);
	}
}
 