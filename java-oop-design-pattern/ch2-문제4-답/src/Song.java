
public class Song {
	private DiscountedMode mode;
	public void setMode(DiscountedMode mode) {
		this.mode = mode;
	}
	public  double getPrice() {
		return 10.0-(10.0*this.mode.getDiscountRate());
	}
}
