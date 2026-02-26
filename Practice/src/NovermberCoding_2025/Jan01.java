package NovermberCoding_2025;

public class Jan01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[][] = {{1,2},{0,3,4},{0,3},{1,2,4},{1,3}};
       boolean visit[] = new boolean[arr.length];
        // System.out.println(arr.length);
     //  dfs(arr , visit , 0);
       
       System.out.println(1%3);
	}
	
	public static void dfs(int arr[][] , boolean visit[] , int curr ) {
		
		
		System.out.println(curr);
		visit[curr] = true;
		for(int i =0 ; i<arr[curr].length ; i++ ) {
			visit[i] = true;
			curr = arr[curr][i];
			if(visit[curr] == false) {
				dfs(arr,visit , curr);
			}
		}
	}
}
