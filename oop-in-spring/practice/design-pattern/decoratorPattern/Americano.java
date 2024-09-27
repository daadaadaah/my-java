package decoratorPattern;

public class Americano extends Coffee {

    @Override
    public void brewing() {
        System.out.println("Americano Coffee");
    }
}
