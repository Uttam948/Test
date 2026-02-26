package practices1;

public class Alphabet {
	
	public static void main(String agr[])
	{
		String st = "I am a developer";
		
		String []str = st.split(" ");
		
		for(int i=str.length-1 ; i>=0 ; i--) {
		//	System.out.print(str.length);
			System.out.print(str[i]+" ");
		}
		
	}
	
}
