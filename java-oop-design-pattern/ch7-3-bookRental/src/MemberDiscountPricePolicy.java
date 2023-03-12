

public class MemberDiscountPricePolicy implements PricePolicy {
	public int calcPrice(int price, int n) {
		return (int) (price * n * 0.9);
	}
}
