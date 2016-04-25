package datastructure;

public class Stack {
	int size;
	int[] arr;
	int top = -1;
	
	Stack(int size){
		this.size = size;
		arr = new int[size]; 
		
	}
	
	public void push(int item) throws Exception{
		
		if(top==(arr.length-1)){
			throw new Exception("Stack Overflow");
		}
		else{
			top = top+1;
			arr[top] = item;
			//return arr[top]
		}
		
	}
	
	public int pop() throws Exception{
		
		if(top==-1){
			throw new Exception("Stck Underflow");
			
		}
		else{
			int temp = arr[top];
			top = top - 1;
			return temp;
		}
		
		
	}
	
	public int peek(){
		return arr[top];
	}
	
	public void display(){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		Stack stack = new Stack(5);
		stack.push(2);
		stack.push(4);
		stack.push(5);
		//stack.push(6);
		//stack.push(3);
		stack.pop();
		stack.push(17);
		System.out.println("Peek is "+ stack.peek());
		stack.peek();
		
		
		
		//stack.display();
	}

}
