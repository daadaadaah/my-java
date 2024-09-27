package extends1;

public class ChildArg extends ParentArg {
    public ChildArg() {
        super("ChildArgName ~~~ ");
        System.out.println("Child Constructor");
    }

    @Override
    public void printName() {
        System.out.println("ChildArg printName() Overriding");
    }
}
