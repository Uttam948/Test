package Algorithms;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub8
		
		int arr[] = {5,4,3,7,8,2,1};
		
		int l = 0;
		int r = arr.length-1;
		for(Integer i : arr) {
			
			System.out.print(i);
		}
		System.out.println();
		System.out.println("after merge sort");
		
		divide(arr , l, r);
		
         for(Integer i : arr) {
			
			System.out.print(i);
		}
		
	}
	
	
	
	public static void divide(int arr[] , int l ,int r) {
		
		if(l< r) {
		int mid = (l+r)/2;
		
		divide(arr , l, mid);
		divide(arr, mid+1, r);
		concer(arr, l, r, mid);
		}
		
	}
	private static void concer(int[] arr, int l, int r, int mid) {

          int merged[] = new int[r-l+1];
          int i = l;
          int j = mid+1;
          int x =0;
          while(i <= mid && j <= r) {
        	  
        	  if(arr[i] <= arr[j]) {
        		  merged[x] = arr[i];
        		  i++;
        		  x++;
        	  }else {
        		  
        		  merged[x] = arr[j];
        		  j++;x++;
        	  }
        	  
          }
          while(i<=mid) {
        	  merged[x] = arr[i];
        	  x++;
        	  i++;
          }
          while(j <= r) {
        	  merged[x] = arr[j];
        	  x++;
        	  j++;
          }
          
          for(int g =0,k =l ;g<merged.length;g++ , k++) {
        	  
        	  arr[k] = merged[g];
          }
	}
	
	
}
