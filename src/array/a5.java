package array;

import java.util.Scanner;

public class a5 {
	
	static int small(int[] ar) { 
		int small=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]<small)
				small=ar[i];
		}
		return small;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);                           
		System.out.println("Enter length of the array");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int rec=small(ar);
		System.out.println(rec);
	}

}
