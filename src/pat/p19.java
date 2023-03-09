package pat;

import java.util.Scanner;

public class p19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt(),a=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(a%2+" ");
				a++;
			}
			System.out.println();
		}	
	}
}
