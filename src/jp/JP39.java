                                                
package jp;

import java.util.Scanner;

public class JP39 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to print prime digits count");
		int n=sc.nextInt();
		int pc=0,d;
		while(n!=0) {
			d=n%10;
			if(d==2||d==3||d==5||d==7)
				pc++;
			n=n/10;
		}
		System.out.println("Prime Digits Count = "+pc);
	}
} 