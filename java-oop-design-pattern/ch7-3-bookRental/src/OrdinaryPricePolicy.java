

public class OrdinaryPricePolicy implements PricePolicy {
	public int calcPrice(int price, int n) {
		return price * n;
	}
}
