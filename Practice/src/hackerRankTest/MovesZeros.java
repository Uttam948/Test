package hackerRankTest;

public class MovesZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,1,0,0,1,0,1,1,1};
		int i = 0;
		int n = arr.length;
		int countzero = 0;
		int countone = 0;
		int max= 0;
		while(i < n) {
			if(arr[i] == 0) {
				countzero++;
			}if(arr[i] ==1) {
				countone++;
			}
			i++;
		}
		if(countzero > countone) {
			max = countzero;
		}else {
			max = countone;
		}
		int leftone = 0;
		int rightone = 0;
		int left = 0 , right = n-1;
		while(left < max) {
			
			if(arr[left] == 1) {
				leftone++;
			}
			left++;
		}
		while(right > countzero) {
			if(arr[right] == 1) {
				rightone++;
			}
			right--;
		}
		int count = 0;
		int c= 0 , m = n-1;
		if(c <  countzero && m > countzero) {	
		while(arr[c] == 0) {
			c++;
		}
		while(arr[m] == 1) {
			m--;
		}
		
			int temp = arr[c];
			arr[c] = arr[m];
			arr[m] = temp;
			count++;
		}
		
		System.out.println(countzero +" "+ countone + " "+ leftone +" "+ rightone);
		System.out.println(count);
		
		
	}

}
