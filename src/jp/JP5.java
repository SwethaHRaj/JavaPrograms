package jp;

import java.util.Scanner;

public class JP5 {

	public static void main(String[] args) {
		System.out.println("Enter temperature in celsius"); 
		Scanner sc=new Scanner(System.in);
		float cel=sc.nextFloat();
		float far=cel*9/5+32;
		System.out.println(cel+" deg celsius = "+far + " deg Fahrenheit");
	}// main close
}// class close
 