import java.util.LinkedList;


public class Queue<String> extends LinkedList<String> {

	public boolean addQueue(String element) {
        return this.offer(element);
    }
    public String removeQueue() {
    	return this.poll();
    }
    
    public String peekQueue() {
    	return this.peek();
    }

}
