package DataStructure;



public class QueueDataStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue queue = new Queue();
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.dequeue();
		queue.show();

	}

	
}

class Queue{
	
	int queue[] = new int[5];
	int front = 0;
	int rare = 0;
	int size = 0;
	
	public void enqueue(int data) {
		
		queue[rare] = data;
		rare++;
	}
	public void dequeue() {
		
		queue[front] = 0;
		front++;
		
	}
	
	public void show() {
		
		for (int i =0;i<queue.length ; i++) {
			System.out.println(queue[i]);
		}
	}
	
}
