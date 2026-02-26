package Algorithms;

public class QuickSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuickSort quickSort= new QuickSort();
		
	
		 int a[] = {8,7,9,3,5,1,4,2,6};
		int low = 0 , high = a.length-1;
		
		quickSort.QuickSortts(a,low, high);
		
		//int pviot =  partitioning(a, low, high);
	//	System.out.println(pviot);
		
		for(int k : a) {
			
			System.out.println(k);
		}
		

	}
	
	public void QuickSortts(int a[] ,int low , int high )
	{
		
		
		//System.out.println(low +" " + high);
       	
		if(low < high) {
			
			int pviot = partitioning(a, low, high);
			QuickSortts(a,low , pviot-1);
			QuickSortts(a, pviot+1 , high );
			
		}		
		
	}
	private static int partitioning(int a[],int low , int high ) {
		

		int pivot= a[0];
		int i = low;
		int j = high;
		
		while(i < j) {
		
		
		
		while(pivot > a[i]) {i++;}
		 
		while(pivot < a[j]) {j--;}
		
		if(i<j) {
			
			int temp = a[i];
			a[i] = a[j]; 
			a[j] = temp;
		} 
		}
		
		int c= pivot ;
		pivot = a[j];
		a[j] = c;
		
		return j;
	}

	
}
