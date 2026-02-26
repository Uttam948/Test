package Algorithms;

import java.util.TreeSet;

interface ApplyLeave{
	
	public String ValidationLeave();
  
	
}

class Leaves implements ApplyLeave{
	
	int days;
	
	Leaves(int days){
		this.days = days;
	}


	@Override
	public String ValidationLeave() {
		// TODO Auto-generated method stub
		if(days == 0) {
			throw new IllegalArgumentException("Please enter valid Input");
		}else if(days > 1&& days<=3) {
			return "Team Lead";
		}else if(days >=4 && days <= 7) {
			return "Manager";
		}else {
			return "HR";
		}
	}
	
}

public class Normal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplyLeave applyLeave = new Leaves(0);
		System.out.println(applyLeave.ValidationLeave());
	}

}
