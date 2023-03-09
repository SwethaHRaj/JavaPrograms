package multidim;

import java.util.Scanner;

public class M5 {

	public static int called(int[][] a){
		int primes=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(isPrime(a[i][j]))
					primes++;
			}
		}
		return primes;
	}
	
	static boolean isPrime(int n) {
		if(n==1)
			return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row length");
		int r=sc.nextInt();
		System.out.println("Enter coloumn length");
		int c=sc.nextInt();
		int[][] a=new int[r][c];
		System.out.println("Enter Array Elements");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();				
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int rec=called(a);
		System.out.println(rec);
		
	}
}
	