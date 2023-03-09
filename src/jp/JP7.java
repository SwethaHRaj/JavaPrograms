package jp;

import java.util.Scanner;

public class JP7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter amount");	//5623
		int n=sc.nextInt();
		System.out.println("2000's ---> "+(n/2000));
		System.out.println("500's  ---> "+(n%=2000)/500);
		System.out.println("200's  ---> "+(n%=500)/200);
		System.out.println("100's  ---> "+(n%=200)/100);
		System.out.println("50's   ---> "+(n%=100)/50);
		System.out.println("20's   ---> "+(n%=50)/20);
		System.out.println("10's   ---> "+(n%=20)/10);
		System.out.println("5's    ---> "+(n%=10)/5);
		System.out.println("2's    ---> "+(n%=5)/2);
		System.out.println("1's    ---> "+(n%=2));
	}

}
 