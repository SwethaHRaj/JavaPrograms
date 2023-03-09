package array;

import java.util.Scanner;

public class a19 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of the array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) 
			a[i]=sc.nextInt();
			
		int big=a[0];
		for(int i=0;i<a.length;i++) 
			if(a[i]>big)
				big=a[i];
				
		int[] td=new int[big+1];
		for(int i=0;i<a.length;i++)
			td[a[i]]++;
		
		for(int i=0;i<td.length;i++)
			if(td[i]!=0)
				System.out.println(i+"--->"+td[i]+" times");
		
		
		
		
		
		
	}
}
	
	