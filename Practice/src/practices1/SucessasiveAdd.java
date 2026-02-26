package practices1;

public class SucessasiveAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String st = "1adb2sd123asd8d"; //126
           int sum = 0;
           int sum2 = 0;
           int sum3 = 0;
           for(int i = 0; i<st.length() ; i++) {
        	   
        	   if(Character.isDigit(st.charAt(i))) {
        		  int val = st.charAt(i) - '0';
        		   sum = sum * 10 + val;
        		  
        	   }else {
        		   sum2 = sum2 + sum;
        		   sum = 0;
        	   }
           } 
           
           sum2 = sum2 + sum;
           System.out.println(sum2);
	}

}
