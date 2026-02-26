package Algorithms;

public class Recurrsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recurrsion recurrsion = new Recurrsion();
	//	recurrsion.add(5);
		String st = "ABC";
		recurrsion.recurrsion(st, 0);

	}
	
	public String recurrsion(String str, int j) {
		String st = str;
		char ch[] = str.toCharArray();
		int i =0 ;
		
		if(j<str.length()) {
		
		char c[] = swipe(ch , i ,j);
		String s = String.valueOf(c);
		System.out.println(s);
		char cm[] = swipe(ch , 1 ,2); 
		String strr = String.valueOf(cm);
		System.out.println(strr);
		}else {
			return "";
		}
		return recurrsion(st , j+1);
	}

	 public char[] swipe(char ch[],int i, int j ) {
		char  c = ch[i];
		ch[i] = ch[j];
		ch[j] = c;  
		 return ch;
	 }
	
	public int add(int n) {
		
		if(n>0) {
		System.out.println(n);
		}else {
			System.out.println(n);
			return 0;
		}
		return add(n-1);
	}
}
