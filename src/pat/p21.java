package pat;

import java.util.Scanner;

public class p21 {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt(),a=1;
		for(int i=1;i<=n;i++) {
			int x=1;
			for(int j=1;j<=i;j++) {
				System.out.print(i++" ");
			}
			System.out.println();
		}	
	}
}


//0 4 7 9 10 

//5 4 3 2 1
//1 2 3 4 5