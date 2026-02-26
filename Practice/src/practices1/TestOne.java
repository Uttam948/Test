package practices1;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 12345 ; 
		int a = 0;
		int b = 0;
		
		while(n >0) {
			
			a = n%10;
			 n = n/10;
			 b = b*10 + a;
			 
		}
		
		//System.out.println(b);
		
		TestOne  testOne = new TestOne();
	//	testOne.checkPrime(10);
	//	testOne.printNumberTillPrime(15);
		
		int t= 10;
		 int z = t++ ;
		
		System.out.println(z);
		

	}

	public void checkPrime(int a) {
		
		int count = 0;
		
		for(int i =1 ;i<=a ; i++) {
			
			if(a % i == 0) {
				count ++;
			}
			
			
		}
		if(count  == 2 ) {
			
			System.out.println("Prime Number");
		}else {
			System.out.println("Not");
		}
	}
	
	public void printNumberTillPrime(int a) {
		
		String ab = "";
		
		for(int i = 2; i<= a ; i++) {
			
			int count = 0;
			
			for(int j = 1 ; j<=a ; j++) {
				
				if(i % j ==0) {
					count++;
				}
			}
			
			
			if(count == 2) {
				System.out.println(i);
			}
		}
	}
}
