                                            
package jp;

public class JP60 {
	
	static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	static void called(){	 
		for(int i=2;i<=100;i++) {
			if(isPrime(i))
				System.out.print(i+" ");
		}
	}
	
	
	public static void main(String[] args) {	
		called();
	}
} 