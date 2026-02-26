package LowLevelDesignPattern;


//✅ Pros:

//Simple and straightforward.
//No need to define extra interfaces.
//❌ Cons:

//Tightly coupled to Student2 class. If you later want a general cloning mechanism for multiple classes, you need to modify each class individually.
//No contract is enforced, meaning other developers working on your code may forget to implement clone() in different objects.
class Student2{

	  private String name;
	  private int id;

	  Student2(String name ,  int id){
		  this.name = name;
		  this.id = id;
	  }
	  
	  public Student2 clone(){
	  
	    return new Student2(name ,id );
	   
	  }
	 
	  public void showData() {
	    	System.out.println("this is you " + id + "And this is you name " + name);
	    }

	}

//✅ Pros:

//Follows Prototype Design Pattern Properly

//The Prototype pattern encourages using an interface to define cloning behavior for any class.
//More Maintainable & Scalable

//If later, you add more classes that need cloning, you can simply implement Prototype rather than modifying each class separately.


class Student implements prototype{
	
  int id;
  private String name;
  
  
    Student() {
 }
 
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

    @Override
   public prototype clone() {
	return new Student(id,name);	
}
    public void showData() {
    	System.out.println("this is you " + id + "And this is you name " + name);
    }
	
}

interface prototype{
	
	public prototype clone();
}


public class PrototypeDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student(1,"Uttam");
		
		Student obj =(Student)student.clone();
		 obj.showData();
		
		Student2 student2 = new Student2("Uttam",1);
		
		Student2 st = student2.clone();
		
		st.showData();
		
		
		
		
	}

}
