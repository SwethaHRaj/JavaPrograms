package string;

import java.util.Scanner;

public class S5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		
		int[] ar=new int[128];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			ar[ch]++;
		}
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]!=0)
				System.out.println((char)i+"---->"+ar[i]+" times");
			
		}
	}
}




