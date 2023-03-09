package array;

import java.util.Scanner;

public class MainArray {

	public int[] readArray() {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		int[] ar=new int[n]; 
		System.out.println("Enter array elements");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	
	public void printArray(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}
}