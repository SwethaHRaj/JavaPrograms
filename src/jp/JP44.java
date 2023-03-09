
package jp;

import java.util.Scanner;

public class JP44 {

	public static void main(String[] args) {		//continue
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to find number of ZEROS present");
		int n=sc.nextInt();
		
		int d,count=0;
		do{      
			d=n%10;
			if(d==0)
				count++;
			n=n/10;
		}while(n!=0) ;
		System.out.println("ZEROS count = "+count);
			
	}
} 