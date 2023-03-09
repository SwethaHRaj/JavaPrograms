                                            
package jp;

import java.util.Scanner;

public class JP58 {		//PLEASE CONTINUE
	
	static boolean called(int n) {
		int d,sum=0;
		while(n!=0){
			d=n%10;
			sum=sum+d*d;
			n=n/10;
		}
		switch(sum) {
		case 1: return true;
		default:{
			if(sum<10)false
				return false;
		}
		called(sum);
		}
	}

	public static void main(String[] args) {	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of n to check HAPPY NUMBER");
		int n=sc.nextInt();
		
		boolean rec = called(n);
		if(rec)
			System.out.println("HAPPY NUMBER");
		else
			System.out.println("NOT HAPPY NUMBER");
	}
} 