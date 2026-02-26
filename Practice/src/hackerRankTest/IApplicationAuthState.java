package hackerRankTest;

import java.util.ArrayList;
import java.util.List;

public interface IApplicationAuthState {

  	List<String> AllowedLocations = new ArrayList<String>();
	
	List<IUser> iUser = new ArrayList<IUser>();
	
	public static final List<IUser> RegisteredUsers = null;
	 public static final List<IUser> UserLoggedIn = null;
	
}
