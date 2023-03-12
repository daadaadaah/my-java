import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;


public class CartForSongs {
	
	ArrayList<Song> cart = new ArrayList<Song>();
	public double calculateTotalPrice() {
		
		double total = 0.0;
		Iterator<Song> itr = cart.iterator();
		
		while (itr.hasNext()) {
			Song s = itr.next();
			
			if (s.getDiscountMode().equals("OnSale")) total = total+(s.getPrice()-0.1*s.getPrice());
			else if (s.getDiscountMode().equals("TodayEvent")) total = total+(s.getPrice()-0.3*s.getPrice());
			else total = total+s.getPrice();
			
		}
		return total;
	}
	
	public void add(Song s) {
		cart.add(s);
	}

}
