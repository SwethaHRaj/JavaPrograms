package array;

import java.util.Scanner;

public class a8 {
	
	static int[] called(int[] ar) { 
		int ec=0,oc=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0)
				ec++;
			else
				oc++;		
		}
		int[] send= {ec,oc};
		return send;
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
		int[] rec=called(ar);
		System.out.println("even = "+rec[0]);
		System.out.println("odd = "+rec[1]);
		}
		
	}

