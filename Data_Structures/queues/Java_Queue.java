import java.util.ArrayList;

public class Queue_DataStructure<T> {
		
		private ArrayList<T> list;
		private int size;
	
	public Queue_DataStructure() {
		list = new ArrayList<T>();
		size = 0;
	}
	
	public void push(T data) {
		size++;
		list.add(data);
	}
	
	public T pop() throws Exception {
		if(size == 0) {
			throw new Exception("Error: Queue is empty");
		}
		size--;
		return list.remove(0);
	}
	
	public T peek() throws Exception {
		if(size == 0) {
			throw new Exception("Error: Queue is empty");
		}
		return list.get(0);
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		list = new ArrayList<T>();
		size = 0;
	}
	
	public String toString() {
		return list.toString();
	}
}
