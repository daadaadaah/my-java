package decoratorPattern;

// 여러가지 데코레이터의 상속 목적으로만 사용할 거라서 `abstract` class로 선언
public abstract class Decorator extends Coffee {

    Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
