package array;

import java.util.Scanner;

public class a12 {
	
	static int[] called(int[] ar) { 
		int es=0,os=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0)
				es+=ar[i];
			else
				os+=ar[i];
		}
		int[] send= {es,os};
		return send;
	}
	
	public static void main(String[] args) {
		MainArray m=new MainArray();
		int[] ar=m.readArray();
		m.printArray(ar);
		int[] rec=called(ar);
		System.out.println(rec[0]);
		System.out.println(rec[1]);
	}
}

