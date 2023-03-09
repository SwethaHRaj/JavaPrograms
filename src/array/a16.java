package array;

import java.util.Scanner;

public class a16 {
	
	static int[] called(int[] a,int index) {
		int[] send=new int[a.length-1];
		for(int i=0;i<a.length-1;i++) {
			if(i<index)
				send[i]=a[i];
			else
				send[i]=a[i+1];
		}
		return send;
	}
	
	public static void main(String[] args) {
		MainArray m=new MainArray();
		int[] a=m.readArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index value to delete element");
		int index=sc.nextInt();
		int[] rec=called(a,index);
		m.printArray(rec);
		
	}
	
}
	
	