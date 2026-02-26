
public class MatrixProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		int arr[][] = new int[3][3];
              for(int i =0 ;i< 3; i++) {
            	 
            	 for(int j =0 ; j<3 ;j++) {
            		 
            		 arr[i][j] = count++;
            		// System.out.print(count+++" ");
            		 
            	 }
            	// System.out.println();
             }
              
              for(int i =0 ;i< 3; i++) {
             	 
             	 for(int j =0 ; j<3 ;j++) {
             		 
             		System.out.print(arr[i][j]+ " ");
             		 
             	 }
             	 
             	 System.out.println();
              }
              System.out.println();
              
              // this is for 1st row
           
              int val = arr[0][0];
              arr[0][0] = arr[1][0];
              int val2 = arr[0][1];
              arr[0][1] = val; 
              int val3 = arr[0][2];
              arr[0][2] = val2;
              int val4 = arr[1][2];
              arr[1][2] = val3;
              int val5 = arr[2][2];
              arr[2][2] = val4;
              int val6 = arr[2][1];
              arr[2][1] = val5;
              int val7 = arr[2][0];
              arr[2][0] = val6;
              arr[1][0] = val7;
              
              for(int i =0 ;i <arr.length ; i++) {
            	  for(int j = 0 ; j<arr.length ; j++) {
            		  
            		  System.out.print(arr[i][j] + " ");
            		  
            	  }
            	  System.out.println();
              }
              
             // System.out.println(arr[1][2]);
             
	  }

}
