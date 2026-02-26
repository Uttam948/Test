package LowLevelDesignPattern;

import java.util.ArrayList;
import java.util.List;

//I would like to create a class and an interface 

interface Employee{
	
	public void addEmpl(AddEmployeDetails employee);
	
	public void update();
	
}

class AddEmployeDetails{
	
	private int Id;
	private String name;
	
	AddEmployeDetails(int id , String name){
		this.Id = id;
		this.name = name;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

class CheckEmployee implements Employee{
	
	List<AddEmployeDetails> employe = new ArrayList<>();

	@Override
	public void addEmpl(AddEmployeDetails employee) {
		// TODO Auto-generated method stub
		employe.add(employee);
	}

	
	public void sendEmail(int a) {
		System.out.println("Stop adding value of Employee");
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		int i = 0;
		for (AddEmployeDetails empl : employe) {
			i++;
			if(i == 10) {
				sendEmail(i);
			}
		}
	}
}

public class PracticeObservable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckEmployee checkEmployee = null;
		List<AddEmployeDetails> listEmployeDetails = new ArrayList<>();
		
		for(int i = 1;i< 15 ; i++) {
			 
			checkEmployee.addEmpl(new AddEmployeDetails(i, "Uttam"));
			checkEmployee.update();
			
		}
		
		
		
	}

}
