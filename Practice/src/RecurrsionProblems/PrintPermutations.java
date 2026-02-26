package RecurrsionProblems;

import java.util.ArrayList;
import java.util.List;

public class PrintPermutations {
 
//	private static  List<List<String>> lit = new ArrayList<>();
	
	public static List<List<String>> listpermutation(int arr[]){
		List<List<String>> lit = new ArrayList<>();
		
		return lit;
	}
	
	public static void permutations(String str, String perm) {
		 
		if(str.length() == 0) {
			List<String> list = new ArrayList<>();
			list.add(perm);
		//	listpermutation(list);
			System.out.print(perm+" ");
			return ;
		}
		
		for(int i = 0;i<str.length() ; i++) {
			char currChar = str.charAt(i);
			String newStr = str.substring(0,i) + str.substring(i+1);
		   // System.out.println(str.substring(0,i) +"  "+ str.substring(i+1) );
		 //   System.out.println(newStr);
			permutations(newStr , perm + currChar );

		}
	}
	
	public static void IntegerPermute(int arr[] , int s) {
		    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABC";
		int ar[] = {1,2,3,4};
		//System.out.println(str.substring(1));
		System.out.println(str.substring(0, 1));
	//	System.out.println(str.substring(1));
	//	List<List<String>> lit = listpermutation(new ArrayList<>());
	//	System.out.println(listpermutation(list));
	//	System.out.println(ar[0+1]);
		//String newStr = str.substring(0,2) + str.substring(1+2);
	//	System.out.println(newStr);
		//System.out.println(str.substring(0,1));
		//permutations(str , "" );
		//System.out.println(lit);
		
	}

}
