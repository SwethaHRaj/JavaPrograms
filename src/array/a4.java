package array;

import java.util.Scanner;

public class a4 {
	
	static int big(int[] ar) { 
		int big=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>big)
				big=ar[i];
		}
		return big;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
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
		int rec=big(ar);
		System.out.println(rec);
	}

}
