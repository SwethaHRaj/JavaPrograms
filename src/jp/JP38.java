
package jp;

import java.util.Scanner;

public class JP38 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to count even or odd digits count");
		int n=sc.nextInt();
		int ec=0,oc=0;
		do{
			if(n%2==0)
				ec++;
			else
				oc++;
			n=n/10;
		}while(n!=0);
		System.out.println("even Count = "+ec+"\nodd count  = "+oc);
	}
} 