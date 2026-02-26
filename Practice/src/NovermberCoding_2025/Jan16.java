package NovermberCoding_2025;

public class Jan16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int points[][] = {{1,1},{3,4} , {-1,0}};
         
        int v1 = points[0][0] ;
        int count =0 ;
        
       for(int i =0 ;i<points.length-1 ; i++) {
    	   
    	   int dx = Math.abs(points[i][0] - points[i+1][0]);
    	   int dy = Math.abs(points[i][1] - points[i+1][1]);
    	   
    	   int val = Math.max(dx, dy);
    	   count = count+val;
       }
       
       String str = "Uttam Singh 123";
	   
	   char arr[] = str.toCharArray();
	   
	   for(int m  =0 ;m<arr.length ; m++) {
		   
		   if(Character.isLetter(arr[m])) {
			   System.out.println(arr[m]);
		   }
		   
		  
	   }
	}
	
	
}
