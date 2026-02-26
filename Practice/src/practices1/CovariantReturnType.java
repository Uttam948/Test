package practices1;

public class CovariantReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new B();
		a.show();
	}
	
}

  class A{
	  
	  public void show() {
		  System.out.println("class A");
	  }
  }
  
   class B extends A{
	   
	   public void show() {
			  System.out.println("class B");
		  }
   }
