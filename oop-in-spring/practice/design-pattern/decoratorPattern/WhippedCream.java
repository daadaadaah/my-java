package decoratorPattern;

public class WhippedCream extends Decorator {

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Adding Whipping Cream");
    }
}
