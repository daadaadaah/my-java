

public class BookDiscountPricePolicy implements PricePolicy {
	public int calcPrice(int price, int n) {
		return (int) (price * n * 0.95);
	}
}
