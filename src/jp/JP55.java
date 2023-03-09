                                            
package jp;

import java.util.Scanner;

public class JP55 {
	
	static int called(int n,int p) {
		/*int mul=1;
		for(int i=1;i<=p;i++) 
			mul=mul*n;
		return mul;*/
		int mul=1;
		while(p>0) {
			mul*=n;
			p--;
		}
		return mul;
	}
	
	
	

	public static void main(String[] args) {	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of n and value of power p");
		int n=sc.nextInt();
		int p=sc.nextInt();
		
		int rec=called(n,p);
		System.out.println(rec);

	}
} 