package array;

import java.util.Scanner;

public class a11 {
	
	static int sumOfDigits(int n){
		int sum=0,d;
		while(n!=0) {
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		return sum;
	}
	
	static int[] called(int[] ar) { 
		int[] send=new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			send[i]=sumOfDigits(ar[i]);
		}
		return send;
	}
	
	public static void main(String[] args) {
		MainArray m=new MainArray();
		
		int[] ar=m.readArray();
		m.printArray(called(ar));
		
	}
}

