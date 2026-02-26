
public class NQueenPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[][] = new int[4][4]; 
        
        for(int i =0 ;i<4;i++) {
        	for(int j =0 ;j<4;j++) {
        		arr[i][j] = 0;
        	}
        }
        
        for(int i =0 ;i<4 ; i++) {
        	
        	for(int j = 0;j<4 ; j++) {
        		
        	}
        }
        
        
	}
  
	public static boolean checkQueenPosition(int arr[][] , int row , int column) {
		
		for(int i =1   ; i< 4 ; i++) {
			if(arr[column][i] == 1) {
				return false;
			}
		}
		for(int i = 1;i<4 ; i++){
			if(arr[i][row] == 1) {
				return false;
			} 
		}
		for(int i =1 ; i<4; i++) {
				if(arr[row+i][column+i] == 1) {		
			}
		}
		return true;
	}
}
