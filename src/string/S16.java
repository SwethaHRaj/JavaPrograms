package string;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class S16 {

	public static void main(String[] args) {	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			
		String sf=new String(c);
		System.out.println(sf);
		
	}
}

		
		