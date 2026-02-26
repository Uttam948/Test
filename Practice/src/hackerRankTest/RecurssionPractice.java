package hackerRankTest;

public class RecurssionPractice {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RecurssionPractice.count(3));
	}
	static String st = "1";
	
	public static String count(int a) {
	    int count = 1;
		if(st.length() < a ) {
			
			for(int i =0 ; i<st.length()-1;i++) {
				
				if(st.charAt(i) == st.charAt(i+1)) {
					count++;
				}else {
					st  = String.valueOf(count).concat(String.valueOf(st.charAt(i)));
					count = 1;
				}
			}
			//if(st.length() == 1) {
			st = st.concat(String.valueOf(count)) ;
			//}
			return count(a);
		}else {
			//System.out.println(a);
			return st;
		}
	}

}
