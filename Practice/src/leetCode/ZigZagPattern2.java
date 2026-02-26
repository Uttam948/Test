package leetCode;

public class ZigZagPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "PAHNAPLSIIGYIR";
		int rownum = 3;
		int v=0;
		int i = 0;
		int j = 0;
		int m= 0;
		char ch[][] = new char[rownum][str.length()/2];
	
		while(v < str.length()) {
			
			if(m % (rownum-1) == 0) {
				
				while(i < rownum) {
					ch[i][0] = str.charAt(v);
					i++;
					v++;
				}
			//	for(int m = 0 ; m < rownum ; m++) {
					
				//	ch[m][0] = str.charAt(v);
					//v++;
			//	}
			}else {
				while(i > 0) {
					i--;
					j++;
					ch[i][j] = str.charAt(v);
					v++;
					System.out.println(ch[i][j]);
				}		
				j = 0;
				m++;
			}
		}
		for(int k =0;i<rownum ; i++) {
			for(int l = 0; l<ch.length ; l++) {
				System.out.println(ch[k][l]);
			}
			System.out.println();
		}
	}
	
	

}
