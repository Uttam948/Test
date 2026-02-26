package leetCode;

public class MethodReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int reuss(int a, int b){
	
		if(a == b) {
			return a+b;
		}else {
			reuss(a++ , b);
		}
		
		 return reuss(a , b--);
		 
	
	}
}
