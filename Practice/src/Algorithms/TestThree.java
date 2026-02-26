package Algorithms;

public class TestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "MrirUttamJi";           
		  String s2 = "ShrirQUttamSingh";
		  
		  char[] a1 = s1.toCharArray();
		  char[] a2 = s2.toCharArray();

		     int i = 0;    
		     int max  = 0;
		int val  =0;
	
		   while(i < s1.length()-1 ){
		            int count = 0;
		            for(int j =0 ; j < s2.length()-1;j++){
                         
		                  if(a1[i] == a2[j])  {

		                     i++;
		                     count++;
		                     
		                 }else {
		                	 if(count > max){

			                      max = count;
			                     val = i;
			               }
		                	 count =0;
		                 }   
		             }
		      i++;
		      }

		    System.out.println(max);
		    String st = s1.substring((val-max) , val);

		     System.out.println(st);
		      
		      
		 }  
	
	
	  



	}


