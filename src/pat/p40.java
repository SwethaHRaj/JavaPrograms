
package pat;

import java.util.Scanner;

public class p40 {

	public static void main(String[] args) { 		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		int st=n,sp=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("* ");	
			}
			if(i<=n/2) {
				sp++;
				st-=2;
			}
			else {
				sp--;
				st+=2;
			}
			System.out.println();
		}	
	}
}
