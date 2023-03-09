package pat;

import java.util.Scanner;

public class p23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt(),a=1;
		for(int i=1;i<=n;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}	
	}
}
