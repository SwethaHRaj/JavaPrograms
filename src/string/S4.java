package string;

import java.util.Scanner;

public class S4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		
		String strU=str.toUpperCase();
		int sp=0;
		for(int i=0;i<str.length();i++) {
			char ch=strU.charAt(i);
			if((ch>='A'&& ch<='Z' || ch>='0'&&ch<='9')==false)
				sp++;
		}
		System.out.println(sp);
	}
}




