package string;

import java.util.Arrays;
import java.util.Scanner;

public class S13 {

	public static void main(String[] args) {	//continue
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=sc.nextLine();
		System.out.println("Enter a String");
		String s2=sc.nextLine();
		if(called(s1,s2))
			System.out.println("anagram");
		else	
			System.out.println("not anagram");
		
	}
	
	static boolean called(String s1,String s2) {
		
		String x=s1.replaceAll(" ", "");
		String y=s2.replaceAll(" ", "");
		if(x.length()!=y.length())
			return false;
		String x1=x.toUpperCase();
		String x2=y.toUpperCase();
		char[] c1=x1.toCharArray();
		char[] c2=x2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
		
	}
}