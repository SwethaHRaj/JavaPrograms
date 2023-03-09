package string;

import java.util.Scanner;

public class S6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		
		
		int sum=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
				sum=sum+ch-48;
			
		} 
		System.out.println(sum);
	}
}



