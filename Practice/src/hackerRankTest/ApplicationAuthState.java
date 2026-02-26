package hackerRankTest;

import java.util.ArrayList;
import java.util.List;

public class ApplicationAuthState implements IApplicationAuthState{

	
	//List<String> AllowedLocations = new ArrayList<String>();
	
//	List<IUser> iUsers = new ArrayList<IUser>();
	
//	List<IUser>   RegisteredUsers ;
//	 List<IUser> UserLoggedIn;
	 
	 User u = new User();
     
	
	ApplicationAuthState(){
		
		List<String> AllowedLocations = new ArrayList<String>();
		
		List<IUser> iUser = new ArrayList<IUser>();
		
		final List<IUser> RegisteredUsers ;
		 final List<IUser> UserLoggedIn;
		
	}
	
	 public String Register(IUser user) {
	     
		    if(user.Id != u.Id) {
		    	
		    	RegisteredUsers.add(user);
		    	return "registered successfully!";
		    }else {
		    	return "is already registered";
		    }
	    }
	

	 public String Login(IUser user) {
		 
		 if((user.Id  == u.Id) && 
				  user.incorrectAttempt == 0 && 
				  user.password.contains(u.password) &&
				  !user.email.equals(u.email) ) {
			 
			 
			 UserLoggedIn.add(user);
			 
			 return "Loggged in successfully!";
		 }
		 
	       u.incorrectAttempt++;
		 
		return "is already logged in!";
		 
	 }
	 
	 public String Logout(IUser user) {
		
		 if(user.Id == u.Id) {
			 
			 UserLoggedIn.remove(user);
			 return "logged our successfully!";
		 }else {
			 
			 return "logged out successfully";
		 }
		 
		 
	 }
	 
	
}
