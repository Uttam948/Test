import java.util.Scanner;



class UserNotFound extends RuntimeException{
	
	UserNotFound(String val){
		super(val);
	}
}

public class CustomCheckedException {
	
	public static void main(String[] args) throws UserNotFound {
		// TODO Auto-generated method stub
		int n = 5;
		String st = null;
		
		if(st == null) {
			throw new UserNotFound("Uttam");
		}
		
		
		
	}
	
	

}
