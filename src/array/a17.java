package array;

import java.util.Scanner;

public class a17 {
	
	static void called(int[] a) {
		boolean[] b=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if(b[i]==false) {
				int count=0;
				for(int j=0;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
						b[j]=true;
					}
				}
				System.out.println(a[i]+"--->"+count+" times");
			}
		}
	}
	
	public static void main(String[] args) {
		MainArray m=new MainArray();
		int[] a=m.readArray();
		called(a);		
	}
	
}
	
	