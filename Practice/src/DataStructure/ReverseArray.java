package DataStructure;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s[] = new int[]{2,0,9,0,6,0,7,5,8};
		
	//	int s[] = new int[]{2,9,3};
		
		ReverseArray ReverseArray = new ReverseArray();
		//ReverseArray.reverse(s);
		
		//ReverseArray.largestThree(s);
		//ReverseArray.SecondLargest(s);
		//ReverseArray.moveZeroToEnd(s);
		//ReverseArray.revmoveZero(s);
		ReverseArray.DeleteAnElement(s);
	}
	
	public void reverse(int a[]) {
		
		int c[] = new int[a.length];
		int j =0 ;
		for(int i=a.length-1;i>=0;i--) {
			
			c[j] = a[i];
			j++;
		}
		
	   for(int i =0 ; i<c.length ; i++) {
		 //  System.out.println(c[i]);
	   }
	}

	public void largestThree(int a[]) {
		
		int fm =0 , sm = 0 , tm =0 ;
		
		for(int i=0 ; i<a.length ; i++) {
			
		
			
			if(fm < a[i]) {
				
				tm = sm;
				sm = fm;
				fm = a[i];
			}
			
			if(sm < a[i] && fm > a[i]) {
				
				tm = sm;
				sm = a[i];
			}
			if(tm < a[i] && fm >a[i] && sm > a[i]) {
				
				tm = a[i];
			}
			
		}
		
		
		System.out.println(fm +"," +sm +","+tm);
	
	}
	
	public void SecondLargest(int a[]) {
		
		int fm = 0 , sm = 0;
		
		for(int i =0 ;i <a.length ; i++) {
			
			if(fm < a[i]) {
				
				sm = fm;
				fm = a[i];
			}
			
			if(sm < a[i] && fm > a[i]) {
				
				sm = a[i];
			}
		}
		
		System.out.println( sm);
		
	}
	
	public void moveZeroToEnd(int a[]) {
		
		int c = 0;
		int n = a.length-1;
		
		 for(int i =0 ;i<n ; i++) {
			 
			 
			  
			 if(a[i] == 0) {
				 
				c = a[n];
				a[n] = a[i];
				a[i] = c;
				 
				
                n--;
				 		 
			 }
			 
			// System.out.println(n);
			 
					 }
		 
		 for(int i =0 ;i<a.length ; i++) {
		 System.out.println(a[i]);
		 }
	}
	
	public void evenGreaterOdd(int a[]) {
		
		
	}
	
	public void revmoveZero(int a[]) {
		
		int count = 0;
		
		for(int i=0 ; i < a.length ; i++) {
			
			if(a[i] == 0) {
				count ++ ;
			}
		}
		Arrays.sort(a);
		int k = 0;
		int b[] = new int[a.length - count];
		for(int i = count ; i < a.length ; i++) {
			
			b[k] = a[i];
			k++;
		}
		for(int i =0 ; i<b.length ; i++) {
			System.out.println(b[i]);
		}
		
	}
	
	public void DeleteAnElement(int a[]) {
		
		for (int i =0 ;i<a.length ; i++) {
			
			if(a[i] == 7) {
				i++;
			}
				System.out.println(a[i]);
			
		}
	}
}
