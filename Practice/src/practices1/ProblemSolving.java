package practices1;

public class ProblemSolving {

	public static void main(String agr[]) {
		
		String st = "aabbbhhhhsssaass";
	    char arr[] = st.toCharArray();
	    int arr1[] = new int[st.length()];
	    char visited = 0;
	    for(int i=0;i<st.length();i++)
	    {
	    	int count  = 1;
	    	for(int j=i+1 ; j<st.length();j++)
	    	{
	    		if(arr[i] == arr[j])
	    		{
	    			count++;
	    			arr[j] = visited;
	    		}
	    	}
	    	if(arr[i] != visited)
	    	{
	    		arr1[i] = count;
	    	}
	    }
	    
	    for(int i=0;i<st.length();i++)
	    {
	    	if(arr1[i] != 0)
	    	{
	    		System.out.println(arr1[i]);
	    	}
	    }

	}
}

