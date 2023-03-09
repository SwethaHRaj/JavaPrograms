package string;

import java.util.Scanner;

public class S1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		
		int c,s,sp,d;
		c=s=sp=d=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z')
				c++;
			else if(ch>='a' && ch<='z')
				s++;
			else if(ch>='0' && ch<='9' )
				d++;
			else
				sp++;
		}
		System.out.println("Capital--->"+c+"\nSmall--->"+s+"\nDigits--->"+d+"\nSpecial--->"+sp);
	}
}
