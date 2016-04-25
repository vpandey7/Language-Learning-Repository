package datastructure;

public class Queue {
	
	int [] arr;
	int front,end;
	int size;
	
	public Queue(int size){
		this.size = size;
		arr = new int[size];
		front = -1;
		end = -1;
	}
	
	public void enqueue(int item) throws Exception{
		
		if(end==(size-1)){
			throw new Exception("Queue is full");
		}
		else if(front == -1){
			front++;
			arr[front] = item;
			end = front;
		}
		else{
			end++;
			arr[end] = item;	
		}
		
	}
	
	public int dequeue() throws Exception{
		int temp;
		if(front==-1 && end==-1){
			throw new Exception("Queue is empty");
		}
		else{
			//System.out.println("front is" +front);
			temp = arr[front];
			front++;
		}
		return temp;
	}
	
	public void display(){
		
		for(int i=front;i<end+1;i++){
			System.out.println(arr[i]);
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		Queue q1 = new Queue(10);
		q1.enqueue(5);
		q1.enqueue(7);
		q1.enqueue(8);
		System.out.println(q1.dequeue());
		//q1.dequeue();
		//q1.display();
		
		
	}
}


