package leetCode;


class Node{
	
	int data;
	Node next;
}

public class AddingTwoShortedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "11";
		String b = "1";
		int carry = 0;
		 int max = (a.length()>b.length()) ? a.length():b.length();
		
		for(int i = max-1 ; i >= 0 ;i--){
            
            int m = a.charAt(i) - '0';
            int n = b.charAt(i) - '0';
            int num = m + n;

            if(num == 2){
              num = 0  + carry;
                 carry++;

            }else{
                num = m+n+carry;
               carry = 0;
            }
            
            num = num*10 + num;
       }
	}

}
