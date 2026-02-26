package hackerRankTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String st = "!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U"; //fff.jkl.gh
		String s = "";
		int k = 62;
		
		while(k>26) {
			k = k - 26;
		}
		
		
		for(int i = 0;i<st.length() ; i++) {
			
			if(Character.isLetter(st.charAt(i))) {
				
				int a = st.charAt(i) + k;
				
				if(a > 122) {
					a = (97 + a - 122)-1;
				}else if(a > 90 && a < 97) {
					a = (65 + a - 90)-1;
				}
				
				char c =(char)a;
			     s = s.concat(String.valueOf(c));
			
			}else {
				s =	s.concat(String.valueOf(st.charAt(i)));
			}
		}
		System.out.println(s);
	}

}
