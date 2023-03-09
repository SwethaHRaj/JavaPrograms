package string;

import java.util.Iterator;
import java.util.Scanner;

public class S12 {

	public static void main(String[] args) {	//continue
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=sc.nextLine();
		System.out.println("Enter a String");
		String s2=sc.nextLine();
		System.out.println(called(s1,s2));
		
	}
	
	static boolean called(String s1,String s2) {
		int[] c1=new int[26];
		int[] c2=new int[26];
		String sU1 = s1.toUpperCase();
		for(int i=0;i<sU1.length();i++) {
			char ch=sU1.charAt(i);
			if(ch>='A'&&ch<='Z')
				c1[sU1.charAt(i)-65]++;
		}
		String sU2 = s2.toUpperCase();
		for(int i=0;i<sU2.length();i++) {
			char ch=sU2.charAt(i);
			if(ch>='A'&&ch<='Z')
				c2[sU2.charAt(i)-65]++;
		}	
		for(int i=0;i<c1.length;i++) {
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
}