package string;

import java.util.Scanner;

public class S3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		
		boolean rec=called(str);
		System.out.println(rec);
	}
	
	
	public static boolean called(String str) {
		int i=0,j=str.length()-1;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}




