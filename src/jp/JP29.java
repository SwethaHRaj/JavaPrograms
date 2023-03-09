
package jp;

import java.util.Scanner;

public class JP29 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to find Even sum and Odd sum");
		int n=sc.nextInt();
		int esum=0,osum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0)
				esum+=i;
			else
				osum+=i;
		}
		System.out.println("Sum of even Numbers is "+esum);
		System.out.println("Sum of Odd Numbers is "+osum);
	}
}
 