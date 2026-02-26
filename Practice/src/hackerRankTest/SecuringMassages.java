package hackerRankTest;

public class SecuringMassages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Kate Wins?let";
		
		
		
		try {
			
			SecuringMassages encrpt = new SecuringMassages();
			
			System.out.println(encrpt.getEncryptedName(name));
			
		}catch(Exception e) {
			
			throw new IllegalArgumentException("Try again with valid name");
		}

	}
	
	
	public String  getEncryptedName(String str) {
		
	     String st =new StringBuilder(str).reverse().toString().toLowerCase();
	     
	     
	  
		return st;
		
		
		
	}

}


