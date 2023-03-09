package array;

import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter array elements of integer type");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("Array elements are");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}	
	}

}
