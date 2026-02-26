package LowLevelDesignPattern;



class Students{
	
	int rollNumber;
	String name;
	String sirname;
	int phone;
	
	public Students(Students students) {
	}
		// TODO Auto-generated constructor stub
	


	public Students studentRollnumber(int rollnumber) {
		
		this.rollNumber = rollnumber;
		return this;
	}
	
	public Students name(String name) {
		this.name = name;
		
		return this;
	}
	
	 public Students build(Students students) {
		 
		 return new Students(students);
	 }
	
	
	
}


public class BuilderDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
