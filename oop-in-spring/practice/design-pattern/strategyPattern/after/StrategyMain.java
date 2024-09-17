package strategyPattern.after;

import java.util.List;

public class StrategyMain {

    private DiscountStrategy strategy;
    private List<Item> items;

    public static void main(String[] args) {

    }

    public void onFirstGuestButtonClick(){
        // 첫 손님 할인 버튼 누를 때 객체 생성
        strategy = new FirstGuestDiscountStrategy();
    }

    public void onLastGuestButtonClick(){
        // 마지막 손님 대폭 할인 버튼 누를 때 객체 생성
        strategy = new LastGuestDiscountStrategy();
    }

    public void onCalculationButtonClick(){
        // 계산 버튼 누를 때 실행
        Calculator cal = new Calculator(strategy);
        int price = cal.calculate(items);

    }
}
