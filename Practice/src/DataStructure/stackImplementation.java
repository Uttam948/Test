package DataStructure;

public class stackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueStack queue = new QueueStack();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.pop();
		queue.show();
		
	}

}

class QueueStack{
	
	int stack[] = new int [5];
	int top = 0 ;
	
	public void push(int data) {
	
		stack[top] = data;
		top++;
		
	}
	public void pop() {
		top--;
		stack[top] = 0;
	}
	
	public void show() {
		
		for (int i =0;i<stack.length ; i++) {
			System.out.println(stack[i]);
		}
	}
}
