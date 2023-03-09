package array;

public class a13 {		//zigzag
	
	static int[] called(int[] a,int[] b) {
		int[] c=new int[a.length+b.length];
		int i=0,j=0;
		while(i<a.length&&i<b.length) {
			c[j]=a[i];
			j++;
			c[j]=b[i];
			j++;
			i++;
		}
		if(i<a.length) {
			while(i<a.length) {
				c[j]=a[i];
				j++; 
				i++;
			}
		}
		if(i<b.length) {
			while(i<b.length) {
				c[j]=b[i];
				j++; 
				i++;
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		MainArray m=new MainArray();
		int[] a=m.readArray();
		int[] b=m.readArray();
		int[] rec=called(a,b);
		m.printArray(rec);
		
	}
	
}
	
	