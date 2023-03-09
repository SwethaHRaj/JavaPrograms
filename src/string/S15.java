package string;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class S15 {

	public static void main(String[] args) {	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		
		char[] c=s.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++) {
			if(i==0 &&c[i]!=' '|| c[i]!=' '&&c[i-1]==' ') {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
		