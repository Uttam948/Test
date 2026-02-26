package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "0", b = "0";
		
		int result = (a.length() < b.length()) ? b.length() : a.length();
		result = result-1;
		int n = 0 , m = 0;
		Stack stack1 = new Stack();
		Stack stack2 = new Stack();
		Stack stack3 = new Stack();
		Node node = new Node();
		node.data = (int) stack1.peek();
		
		int i = a.length()-1; 
		int j = b.length()-1;
	
	 List<Integer> list = new ArrayList<>();
		
           int carry =0;
           int sum = 0;
		while(i>=0 && j>=0) {
			
			m = a.charAt(i)-'0';
			n = b.charAt(j)-'0';
			sum = m+n + carry;
			if(sum ==2 ) {
				carry = 1;
				sum = 0 ;
			}else if(sum == 3){
				sum = 1;
				carry = 1;
			}else {
				carry = 0;
			}
			 
			//System.out.println(m+""+n);
			list.add(sum);
		//	stack3.push(sum);
			i--;j--;
		}
        while(i>=0) {
        	m = a.charAt(i)-'0';
        	sum = m + carry;
        	if(sum == 2) {
        		sum = 0;
        	}else {
        		carry = 0;
        	}
        //	System.out.println(m);
        	list.add(sum);
        //	stack3.push(sum);
        	i--;
        }
        while(j>=0) {
        	n = b.charAt(j)-'0';
        	sum = n + carry;
        	if(sum == 2) {
        		sum = 0;
        	}else {
        		
        		carry = 0;
        	}
        	//System.out.println(n);
        	j--;
        	list.add(sum);
        	//stack3.push(sum);
        }
        if(carry > 0) {
        	sum = carry;
        	 list.add(sum);
        }
       
       
    //    stack3.push(sum);
       // System.out.println(list);
        String st = "";
       for(int k = list.size()-1;k>=0;k--) {
    	   st = st.concat(String.valueOf(list.get(k)));
       }
       System.out.println(st);
	}
}
