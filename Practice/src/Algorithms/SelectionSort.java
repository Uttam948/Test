package Algorithms;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {6,8,7,9,5,4,3,2,1};
		
		for(int i =0; i<a.length ; i++) {
			
			int min  = i;
			
			for(int j =i+1;j<a.length;j++) {
				
				if(a[j]<a[min]) {
					
					min = j;
				}
			}
			if(min != i) {
				
				
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
			
		}
		
	    for(int i=0;i<a.length;i++) {
	    	
	    	System.out.print (a[i]);
	    }
	}
}
