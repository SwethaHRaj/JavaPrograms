package array;

import java.util.Scanner;

public class a18 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int[] dig=new int[10];
		int d;
		do {
			d=n%10;
			(dig[d])++;
			n=n/10;
		}while(n!=0);
		for(int i=0;i<dig.length;i++) {
			if(dig[i]!=0)
				System.out.println(i+"--->"+dig[i]+" times");
		}
	}
}
	
	