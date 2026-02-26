package practices1;

public class ZigZagSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,3,5,1,4};
		int n = (a.length + 1) / 2 ;
		
		int b[] = new int[n-1];
		int c[] = new int[n-1];
		int d[] = new int[a.length];
		int k=0;
		for(int i=n;i<a.length;i++) {
			b[k] = a[i];
			k++;
		}
		int x=0;
		for(int i=n-2;i>=0;i--) {
			c[x] = a[i];
			x++;
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		
		
		
		

	}

}
