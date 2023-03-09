package string;

import java.util.Iterator;
import java.util.Scanner;

public class S10 {

	public static void main(String[] args) {	//continue
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		System.out.println(called(str));
		
	}
	
	static boolean called(String str) {
		String s=str.toUpperCase();
		if(str.length()<26)
			return false;
		for(char i='A';i<='Z';i++) {
			if(s.indexOf(i)<0)
				return false;
		}
		return true;
		
	}
}