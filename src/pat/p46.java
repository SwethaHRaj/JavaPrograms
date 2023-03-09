
package pat;

import java.util.Scanner;

public class p46 {

	public static void main(String[] args) { 		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		int st=n,sp=0;
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++)
				System.out.print("  ");
			int x=st/2+1;
			for(int j=1;j<=st;j++) {
				System.out.print(x+" ");
				if(j<=st/2)
					x--;
				else
					x++;
			}
		if(i<=n/2) {
			st-=2;
			sp++;
		}
		else {
			st+=2;
			sp--;
		}
		System.out.println();
	}
}
}

