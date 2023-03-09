package array;

import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int n=sc.nextInt();
		double[] ar=new double[n];
		System.out.println("Enter array elements of decimal type");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextDouble();
		}
		double avg,sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		avg=sum/n;
		System.out.println("Average of Array elements is = "+ avg);
		
	}

}
