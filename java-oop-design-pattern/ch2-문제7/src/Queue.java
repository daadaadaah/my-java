import java.util.LinkedList;


public class Queue<String>  {
	private LinkedList<String> q = new LinkedList<String>();
	public boolean addQueue(String element) {
        return q.offer(element);
    }
    public String removeQueue() {
    	return q.poll();
    }
    
    public String peekQueue() {
    	return q.peek();
    }

}
