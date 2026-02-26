package hackerRankTest;

public class HousingAndTank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-H-H-H-H-H   = -HTH-HTHTH
		//HH-HH   == return -1
		// H-HH--
		
		String st ="11";
		String str = "";
		char same = st.charAt(0);
		int count = 1;
		for(int i =1 ;i<st.length();i++) {
			
			if(same == st.charAt(i)) {
				
				count++;
			}else {
				str = str.concat(String.valueOf(count)).concat(String.valueOf(same));
				count = 1;
			}
			same = st.charAt(i);
		}
		str = str.concat(String.valueOf(count)).concat(String.valueOf(same));
		System.out.println(str);
		
	}

}
