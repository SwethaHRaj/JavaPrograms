package string;

import java.util.Iterator;
import java.util.Scanner;

public class S8 {

	public static void main(String[] args) {	//continue
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		System.out.println("Enter character");
		char ch=sc.next().charAt(0);
		
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==ch)
				count++;			
		}
		System.out.println(count);		
	}
}