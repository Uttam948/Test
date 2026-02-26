
public class MatirxsQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int mat[][] = new int[3][3];
        int k = 1;
        for(int i = 0 ; i<3 ; i++) {
        	
        	for(int j = 0 ;j<3 ; j++) {
        		
        		mat[i][j] = k; 
        		k++;
        	}
        }
        
           for(int i = 0 ; i<3 ; i++) {
        	
        	for(int j = 0 ;j<3 ; j++) {
        		
        		System.out.print(mat[i][j]+" ");
        	}
        	System.out.println();
        }
        
           int mate[][] = new int [3][3]; 
           for(int i =0 ; i<3;i++) {
        	   for(int j = 0 ; j<3;j++) {
        		  // mate[i][j] = mat[j][v];
        		   mate[j][2-i] = mat[i][j];
        		 //  System.out.print(mate[j][2-i]+" ");
        	   }
        	  // System.out.println();
           }
           
           System.out.println();
           
           for(int i = 0 ; i<3 ; i++) {
           	
           	for(int j = 0 ;j<3 ; j++) {
           		
           		System.out.print(mate[i][j]+" ");
           	}
           	System.out.println();
           }
           
        
	}

}
