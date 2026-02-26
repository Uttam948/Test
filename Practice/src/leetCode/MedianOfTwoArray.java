package leetCode;

public class MedianOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = {1,2};
		int a2[] = {3,4};
		
		System.out.println(findMedianSortedArrays(a1,a2));
	
		
	}
	
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        
	        int newarr[] = new int [(nums1.length + nums2.length)];
	        int i = 0;
	         int j =0;
	         int k = 0;
	        
	         while(i<nums1.length && j<nums2.length){

	               if(nums1[i] < nums2[j]){
	                  newarr[k] = nums1[i];
	                  k++;
	                  i++;
	               }else{
	                    newarr[k] = nums2[j];
	                    k++;
	                    j++;
	               }
	         }
	         
	         
	         
	               while(i<nums1.length){
	                   newarr[k] = nums1[i];
	                   k++;i++;
	               }

	       //  System.out.println(j +" "+nums2.length);
	                while(j<nums2.length){
	                   newarr[k] = nums2[j];
	                   k++;j++;
	               }
	         double sum = 0;
	         
	         int mid = newarr.length / 2;
	         if(newarr.length % 2 ==0){
	           
	                sum = ((double)newarr[mid-1] +(double) newarr[mid])/2;
	               // System.out.println(newarr[mid-1] + " " +newarr[mid]);

	         }else{
	              sum = newarr[mid];
	               
	         }
	         
	             return sum;
	    }

}
