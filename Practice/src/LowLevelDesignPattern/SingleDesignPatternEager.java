package LowLevelDesignPattern;


class LazyLoading{
	
	private static LazyLoading lazy;
	
	private LazyLoading(){
	}
	
	public static LazyLoading getInstance() {
		if(lazy == null) {
			lazy = new LazyLoading();
		}
		  return lazy;
	}
	

	synchronized public static LazyLoading getInstance1() {
		if(lazy == null) {
			lazy = new LazyLoading();
		}
		  return lazy;
	}
	

	public static LazyLoading getInstance2() {
		
		if(lazy == null) {
			synchronized (LazyLoading.class) {
				if(lazy == null) {
					lazy = new LazyLoading();
				}
			}
		}
		  return lazy;
	}
}

class DBConnection{

	private static DBConnection con = new DBConnection();
	
	private DBConnection() {
		
	}
	public static DBConnection getInstance() {
		return con;
	}
}


public class SingleDesignPatternEager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DBConnection cos = DBConnection.getInstance();
		
	}

}
