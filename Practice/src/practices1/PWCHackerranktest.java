package practices1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Sol{
	
	int a = 10;
	int b = 20;
}

class Account implements Comparable<Account>  , Sol{

	Sol sol;
	int val;
	
	
	
	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
	
		return  max() - o.max();
		//return  Integer.compare(max(), o.max()) ;
		
	}
	
	
	
	public Account(int val) {
		this.val = val;
	}
	
	public String toString() {
		return "this is max value  "+max();
	}
	
	public int max() {
		
	   int v =  val; 
		return v;
	}
	
}

public class PWCHackerranktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Account> list = new ArrayList<>();
		list.add(new Account(50));
		list.add(new Account(10));
		list.add(new Account(20));
		list.add(new Account(30));
		list.add(new Account(3));
		for(Account a : list) {
			//System.out.println(a);
		}
	
		System.out.println(Collections.max(list));
		
		
	}

}
