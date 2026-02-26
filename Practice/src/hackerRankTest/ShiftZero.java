package hackerRankTest;

import java.util.HashMap;
import java.util.Map;

public class ShiftZero {

	
	static class Inner{
		
		 class inner2{
			
			  class Asapd{
			   
				  public int add() {
					  return 20+20;
				  }
			 }
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShiftZero.Inner obj1 = new Inner();
		ShiftZero.Inner.inner2 obj2 = obj1.new inner2();
		ShiftZero.Inner.inner2.Asapd obj3 = obj2.new Asapd();
		
		Map<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        
       String str = "Uttam";
       
      
		
        // System.out.println(obj3.add());
	}

}
