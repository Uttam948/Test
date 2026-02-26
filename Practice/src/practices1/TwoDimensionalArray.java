package practices1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = -10;
		List<List<Integer>> list  =new ArrayList<>();
		

		list.add(Arrays.asList(-1,-1,0,-9,-2,-2));
		list.add(Arrays.asList(-2,-1,-6,-8,-2,-5));
		list.add(Arrays.asList(-1,-1,-1,-2,-3,-4));
		list.add(Arrays.asList(-1,-9,-2,-4,-4,-5));
		list.add(Arrays.asList(-7,-3,-3,-2,-9,-9));
		list.add(Arrays.asList(-1,-3,-1,-2,-4,-5));
		
		int arr[][] = new int[6][6];
		int n =0;	
		for(List<Integer> i : list) {
		   for(int j =0; j <i.size();j++) {
			   
			   arr[n][j] = i.get(j); 
		   }
		   n++;
		}
		for(int i = 0 ; i< 4 ;i++) {
			
			int k = 0;
			int sum1 = 0,sum2 = 0, sum3 = 0;
			for(int j =0 ;j <4 ; j++) {
			
				System.out.println(arr[i][j]+""+arr[i][j+1] +""+ arr[i][j+2]);
				System.out.println(" "+arr[i+1][j+1]);
				System.out.println(arr[i+2][j]+""+ arr[i+2][j+1]+""+arr[i+2][j+2]);
				 sum1 = arr[i][j] + arr[i][j+1]+ arr[i][j+2];
				 sum2 = arr[i+1][j+1];
				 sum3 = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				 k = sum1 + sum2 + sum3;
				 if( max < k) {
						max = k;
					}
			//	 System.out.println(k);
			}
			
			
		}
		System.out.println(max);
	}

	
	public static int sumGlame(List<List<Integer>> list) {
		
		
		for(List<Integer> i : list) {
			int n =0;
			
			for(int j = 0 ; j< i.size() ;j++ ) {
				
				
			}
			
			n++;
		}
		
		
		
		
		return 0;
		
	}
}
