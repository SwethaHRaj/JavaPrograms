package string;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class S14 {

	public static void main(String[] args) {	// copy  to  notes
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(i==0 &&c[i]!=' ') {
				if(c[i]>='a'&&c[i]<='z') 
					c[i]=(char)(c[i]-32);
			}
			else if(c[i]!=' '&&c[i-1]==' ') {
				if(c[i]>='a'&&c[i]<='z') 
					c[i]=(char)(c[i]-32);	
			}
			else   {                              
				if(c[i]>='A'&&c[i]<='Z') 
					c[i]=(char)(c[i]+32);
			}
		}
		String sf=new String(c);
		System.out.println(sf);
		}
}
		