package array;

import java.util.Scanner;

public class a9 {
	
	static int[] called(int[] ar1,int[] ar2) { 
		int[] send=new int[ar1.length+ar2.length];
		for(int i=0;i<send.length;i++) {
			if(i<ar1.length)
				send[i]=ar1[i];
			else
				send[i]=ar2[i-ar1.length];			
		}
		return send;
	}
	
	public static void main(String[] args) {
		MainArray m=new MainArray();
		System.out.println("Enter 1st array elements");
		int[] ar1=m.readArray();
		System.out.println("Enter 2nd array elements");
		int[] ar2=m.readArray();
		int[] rec=called(ar1,ar2);
		m.printArray(rec);
	}
}

