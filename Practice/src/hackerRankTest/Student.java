package hackerRankTest;

public class Student {
	
	Student (String name){
		
		int count = 1; 
		if(name.isEmpty() == false) {
			
			System.out.println(count+":"+name);
			count++;
		}
		
	}
	
	@Override
	public String toString() {
		
		return  "";
		
	}
	
}

