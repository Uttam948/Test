package leetCode;

public class CalculateScoreAfterPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	String instruct[] = {"jump","add","add","jump","jump","jump"};
     //     int value[] = {3,5,12,-1,-3,-5};
    //      String instruct[] = {"jump"};
      //    int value[] = {0};
          String instruct[] = {"jump","add","add","jump","add","jump"};
        int  value[] = {2,1,3,1,-2,-3};
         // calculateScore(instruct,value);
          System.out.println(calculateScore(instruct,value));
          
	}
	
	public static int calculateScore(String[] instructions, int[] values) {
		
		 int i =0;
         int sum= 0;
         int visit[] = new int[instructions.length];
         int j= 0;
        
		
		 while(i < instructions.length) {
        	 
				if(visited(i , visit, j++) == true) {
			       	
		 			 return sum;
		 		 }
       	  if(instructions[i].equals("add")) {
       		  sum = sum + values[i];
       		  i++;     		  
       	  }
       	  
       	  if(instructions[i].equals("jump")) {
       		  i = i + values[i];
       	  }
         
       	   
		 }
		return sum;
	}
	
	public static boolean visited(int i , int visited[], int j) {

	//System.out.println(j +""+ i );
	int count = 0;
	System.out.println(j +""+ i );
		for(int k = 0;k<=j;k++) {
			
			  if(visited[k]== i) {
					return true;
			  }
		  }
		
		visited[j] = i;
		  return false;
	}

}
