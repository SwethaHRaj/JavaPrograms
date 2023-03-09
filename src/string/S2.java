package string;

import java.util.Scanner;

public class S2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		
		int c,v;
		c=v=0;
		String strU=str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			char ch = strU.charAt(i);
			if(ch>='A'&&ch<='Z') {
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				v++;
			else
				c++;
			}
		}
		System.out.println("vowels--->"+v+"\nconsonents--->"+c);
	}
}
