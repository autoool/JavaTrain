package chapter10;

public class LinkStack<T> {
	
	private class Node{
		private T data;
		private Node next;
		
		public Node() {
		
		}
		public  Node(T data,Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node top;
	private int size;
	
	public LinkStack() {
		top = null;
	}
	
	public  LinkStack(T element) {
		top = new Node(element,null);
		size++;
	}
	
	public int length() {
		return size;
	}
	
	public void push(T element) {
		top = new Node(element,top);
		size++;		
	}
	
	public T pop() {
		Node oldValue = top;
		top = top.next;
		oldValue.next = null;
		size--;
		return oldValue.data;
	}
	
	
	public T peek() {
		return top.data;
	}
	
	public boolean empty() {
		return size==0;
	}
	
	public void clear() {
		top = null;
		size = 0;
	}
	
	@Override
	public String toString() {
		if (empty()) {
			return "[]";
		}else {
			StringBuilder stringBuilder = new StringBuilder("[");
			for(Node current = top;current.next!=null;current = current.next){
				stringBuilder.append(current.data.toString()+", ");
			}
			int len = stringBuilder.length();
			return stringBuilder.delete(len-2, len).toString();
		}
	}
	
	
	
	
	
}
