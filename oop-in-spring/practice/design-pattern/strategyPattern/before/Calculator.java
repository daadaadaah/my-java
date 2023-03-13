package strategyPattern.before;

public class Calculator {
    public int calculate(boolean firstGuest, List<item> items){
        int sum = 0;
        for (Item item : items){
            if(firstGuest) {
                sum += (int)(item.getPrice()*0.9);
            } else if(!item.isFresh()) {
                sum += (int)(item.getPrice()*0.8);
            } else {
                sum += item.getPrice();
            }
        }
        return sum;
    }
}