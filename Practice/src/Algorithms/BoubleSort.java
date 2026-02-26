package Algorithms;

public class BoubleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {8,4,5,7,1,2,3}; //4,5,7,1,2,3,8
		int c= 0 ;
		
		for(int i =0 ;i <a.length ; i++) {
			
			for(int j = 0 ; j < a.length ; j++) {
				
				if(a[i] < a[j]) {
					
					c = a[j];
					a[j] = a[i];
					a[i] = c;
					
				}
			}
		}
		for(Integer i : a) {
			System.out.println(i);
		}

	}

}
