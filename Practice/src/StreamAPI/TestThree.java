package StreamAPI;

class Student {
	
	int number;
}
 class TestThree implements Comparable<Student>{

	Student student;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		return o.number - student.number;
	}

}

