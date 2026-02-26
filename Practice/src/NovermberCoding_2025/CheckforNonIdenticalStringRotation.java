package NovermberCoding_2025;

public class CheckforNonIdenticalStringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		String s1 = "abcde";
		String	s2 = "cdeab";
		
		char ch = ' ';
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
				int j = 0;
				char temp = '0';
				 for(int  i =0 ; i<arr2.length ; i++){
			          ch = arr2[s2.length()-1];
			          StringBuilder str = new StringBuilder();
			        for( j = arr2.length-1 ; j > 0 ;j--){
			          
			            arr2[j] = arr2[j-1];
			        }
			        arr2[j] = ch;
			        for(int k =0 ;k<arr2.length ; k++){
			                     
			           str =  str.append(arr2[k]);
			            
			        }
			        System.out.println(str.toString());
			       
		}
	}

}
