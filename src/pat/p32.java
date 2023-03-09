
package pat;

import java.util.Scanner;

public class p32 {

	public static void main(String[] args) { 		//27 problem
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				if(j==i)
					System.out.println(j);
				else
					System.out.print(j+" * ");
			}
			System.out.println();
		}	
	}
}
