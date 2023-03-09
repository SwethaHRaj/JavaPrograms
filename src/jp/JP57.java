                                            
package jp;

import java.util.Scanner;

public class JP57 {
	
	static int countDigits(int n) {
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
	
	static int pow(int n,int p) {
		int mul=1;
		while(p>0) {
			p--;
			mul*=n;
		}
		return mul;
	}
	
	
	static boolean called(int n) {
		int temp=n,d,sum=0;
		int p=countDigits(n);
		do {
			d=n%10;
			sum=sum+pow(d,p);
			p--;
			n=n/10;
		}while(n!=0);
		return (temp==sum);
	}
	
	
	public static void main(String[] args) {	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of n to check ARMSTRONG");
		int n=sc.nextInt();
		
		boolean rec=called(n);
		if(rec)
			System.out.println("DISARIUM");
		else
			System.out.println("NOT DISARIUM");

	}
} 