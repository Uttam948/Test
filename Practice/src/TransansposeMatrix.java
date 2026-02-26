
public class TransansposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int mat[][] = new int[3][3];
        int k = 1;
         for(int i = 0 ; i<3 ; i++) {
        	
        	for(int j = 0 ;j<3 ; j++) {
        		
        		mat[i][j] = k; 
        		System.out.print(mat[i][j]+" ");
        		k++;
        	}
        	System.out.println();
        }
         
         System.out.println();
         
         for(int i = 0;i<3;i++) {
        	 for(int j = i+1 ; j<3 ; j++) {
        		 int temp = mat[i][j];
        		 mat[i][j] = mat[j][i];
        		 mat[j][i] = temp;
        	 }
         }
         for(int i =0 ; i<3; i++) {
        	 
        	 int start = 0 , end = 2;
        	 while(start < end ) {
        		 int temp = mat[i][start];
        		 mat[i][start] = mat[i][end];
        		 mat[i][end] = temp;
        		 start++;
        		 end--;
        	 }
         }
         
         for(int i = 0;i<3;i++) {
        	 for(int j = 0 ; j<3 ; j++) {
        		 System.out.print(mat[i][j]+" ");
        	 }
        	 System.out.println();
         }
         
         
         
        
		
	}

}
