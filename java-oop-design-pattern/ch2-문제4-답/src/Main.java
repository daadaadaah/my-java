
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Song s1 = new Song();
		s1.setMode(new NonDiscounted());
		Song s2 = new Song();
		s2.setMode(new NonDiscounted());
		Song s3 = new Song();
		s3.setMode(new OnSale());
		Song s4 = new Song();
		s4.setMode(new TodayEvent());
		
		CartForSongs c = new CartForSongs();
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		
		System.out.println(c.calculateTotalPrice());

	}

}
