package oopConcept;

import java.util.ArrayList;

interface MyList{
	
	void convert();
	void replace(int idx);
	ArrayList<String> arrayToList();
}

class ArrayToList implements MyList{

	@Override
	public void convert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void replace(int idx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<String> arrayToList() {
		// TODO Auto-generated method stub
		return null;
	}
}


public class InheritanceTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyList obj = new ArrayToList();
		obj.arrayToList();
		
	}

}
