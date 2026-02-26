import java.util.concurrent.ConcurrentHashMap;

public class practiceOnCurrentHashMap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ConcurrentHashMap<Integer , Integer> map = new ConcurrentHashMap<>();
		
	   Runnable t1 = ()->{
		   
		   for(int i = 0; i <5 ; i++) {
			  
			   map.put(i ,  i);
			//  System.out.println("this is a one");
		   }
	   };
	   
	   Runnable t2 = () -> {
		   for(int i = 5; i <10 ; i++) {
			  
			   map.put(i ,  i);
			//  System.out.println("this is a two");
		   }
	   };
	   
      Thread starThread = new Thread(t1);
      starThread.start();
      Thread starThread2 = new Thread(t2);
      starThread2.start();
      
     System.out.println(map);
	}

}
