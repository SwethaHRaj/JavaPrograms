package array;

import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter array elements of integer type");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int big=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>big)
				big=ar[i];
		}
		System.out.println("Biggest of Array elements is = "+ big);
		
	}

}
