
public class ZigZagpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "PAHNAPLSIIGYIR";
		int rownum = 3;
		int arr[][] = new int[rownum][str.length()/2];
		
		char ch[][] = new char[str.length()/2][rownum];
		int v = 0;
		int j = 0;
		//System.out.println(0%2);
		for(int i =0 ; i<str.length()/2 ; i++) {
			System.out.println();
			if(i%rownum == 0) {
				v = j+rownum -1;
				while(j <= v) {
					//System.out.print(v+" ");
					System.out.print(str.charAt(v)+" ");
					v--;
				}
			// for( j =j+rownum-1 ; j >= j-(rownum-1) ; j--) {
			//	 System.out.println(j);
				 //System.out.print(str.charAt(j)+" ");
				 // ch[i][j] = str.charAt(j);
				 
			// }
				j = rownum+v+1;
			}else {
				int n = 0;
				while(n<str.length()/2) {
					if(n==i) {
					System.out.print(str.charAt(j)+" ");
					//ch[i][k] = str.charAt(j);
					j++;
					}
					n++;
				}
			}
			System.out.println();
		//	System.out.println();
			int m = i;
			while(m < rownum-1 )
			{
				if(i==m) {
					
				}
				m++;
			}
		//	for(int k = 1 ; k < rownum-1 ; k++) {
			//	if(i == k) {
				//	System.out.print(str.charAt(j)+" ");
					//ch[i][k] = str.charAt(j);
			//		j++;
				//}
		//	} 
		}
		
		for(int i =0 ; i<ch.length ; i++) {
			for( j = 0; j<ch.length ; j++) {
			//	System.out.println(ch[i][j]+ " ");
			}
			//System.out.println();
		}
	}

}
