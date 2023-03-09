
package pat;

import java.util.Scanner;

public class p30 {

	public static void main(String[] args) { 		//27 problem
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			int x=i;
			for(int j=1;j<=i*2-1;j++) {
				System.out.print(x%2+" ");
				if(j<i)
					x++;
				else
					x--;
			}
			System.out.println();
		}	
	}
}
