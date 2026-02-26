package Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



interface funtionalInterface{
	
	public List<Integer> bubbleSort();
	
}
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int a[] = {4,3,2,1,5,9,0};
		BubbleSort bubbleSort = new BubbleSort();
		//System.out.println(bubbleSort.untionalInterface.bubbleSort());
		
		bubbleSort.bubbleSort(a);
	
	}

	funtionalInterface untionalInterface = ()->{
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(18);
		list.add(16);
		list.add(15);
		list.add(1);
		
	List<Integer> lis	= list.stream().sorted().collect(Collectors.toList());

		return lis;
		
	};
	
	
	public void bubbleSort(int a[]) {
		
		for(int i =0 ; i< a.length ; i++) {
			
			for(int j =0 ; j <a.length-1 ; j++) {
				
				if(a[j] > a[j+1]) {
					
					int c = a[j];
					a[j] = a[j+1];
					a[j+1] = c;
					
				}
			}
		}
		
		for(int i =0 ; i< a.length ; i++) {
			System.out.println(a[i]);
		}
		 
	}

	
}

