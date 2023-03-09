
package jp;

import java.util.Scanner;

public class JP40 {

	public static void main(String[] args) {		//continue
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to check ARMSTRONG");
		int n=sc.nextInt();
		
		int rec=countDigits(n);
		int d=1,sum=0,temp=n;
		while(n!=0) {
			d=n%10;
			for(int i=1;i<rec;i++)
				d*=d;
			sum=sum+d;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("ARMSTRONG");
		else
			System.out.println("NOT ARMSTRONG");
	}
		
	static int countDigits(int n) {
		int d,count=0;
		do{
			d=n%10;
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
} 