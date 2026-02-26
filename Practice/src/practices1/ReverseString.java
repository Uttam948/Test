package practices1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "My name is Uttam";
		
		String st1[] = st.split(" ");
	    
		for(int j =0 ;j <st1.length ; j++) {
			System.out.print(st1[j]+ " ");
		}
	
		System.out.println();
		for(int i=st1.length-1; i>=0 ; i--)
		System.out.print(st1[i]+" ");

	}

}
