package pat;

import java.util.Scanner;

public class p17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}