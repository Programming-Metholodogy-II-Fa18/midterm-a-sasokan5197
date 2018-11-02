public class DataStructure{


	
	class Node{
		int key;
		Node next;
		
	
	public Node(int key){
	
	this.key=key;
	this.next=null;
	}
	}
	
	class Queue{
		Node rear;
		Node front;
		
		public Queue(int key){
			this.rear=this.front=null;
		}
	
	
	
	void add(int key){
		Node temp = new Node(key);
		if(this.rear==null){
			this.rear=this.front=temp;
			
		this.rear=temp;
		this.rear.next=temp;
		
		}
	}
			
	Node remove(){
		
		if(this.front==null)
			return null;
		
		
		Node temp=this.front;
		this.front=this.front.next;
		
		if(this.front==null){
			this.rear=null;
		
		
		}
		return temp;	
	}
	
		
	void getValue( int i){
		
		
		
		
	}
	
		
	
	public void main(String args[]){
		
		add(1);
		add(9);
		add(4);
		add(5);
		add(10);
		add(0);
		
		System.out.print(node);
		
		
		
	}
		
		
		
	}
	
	
	
	
}		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	