package pat;

import java.util.Scanner;

public class p22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt(),a=1;
		for(int i=n;i>=1;i--) {
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}	
	}
}
