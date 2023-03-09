package array;

import java.util.Scanner;

public class a15 {
	
	static int[] called(int[] a,int index,int ele) {
		int[] send=new int[a.length+1];
		send[index]=ele;
		for(int i=0;i<a.length;i++) {
			if(i<index)
				send[i]=a[i];
			else
				send[i+1]=a[i];
		}
		return send;
	}
	
	public static void main(String[] args) {
		MainArray m=new MainArray();
		int[] a=m.readArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index value");
		int index=sc.nextInt();
		System.out.println("Enter Element");
		int ele=sc.nextInt();
		int[] rec=called(a,index,ele);
		m.printArray(rec);
		
	}
	
}
	
	