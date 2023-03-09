package array;

import java.util.Scanner;

public class a7 {
	
	static int called(int[] ar) { 
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];	
		}
		return sum;
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
		int rec=called(ar);
		System.out.println(rec);
		}
		
	}

