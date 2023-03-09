
package pat;

import java.util.Scanner;

public class p45 {

	public static void main(String[] args) { 		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		int st=n,sp=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||i==j||j==1||j==n||i+j-1==n)
					System.out.print("* ");	
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
