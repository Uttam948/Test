package NovermberCoding_2025;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Jan21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = new int[4][4];
		int i = 0 , j = 0;
		int k = 1;
		if(i == 0 && j== 0) {
			for( j = 0;j<4 ; j++) {
				arr[i][j] = k;
				k++;
			}
			for(i = 0 ; i<4 ;i++) {
				arr[i][j-1] = k;
				k++;
			}
			
			while(j-1 >= 0) {
				arr[i-1][j-1] = k;
				k++;
				j--;
			}
			//System.out.println(i +" "+j);
			while(i-1 >= 1) {
				arr[i-1][j+1] = k;
				k++;
				i--;
			}
		}
		for(int n= 0 ; n<4;n++) {
			for(int m= 0;m<4;m++) {
				System.out.print(arr[n][m]);
			}
			System.out.println();
		}
		
        
	}

}
