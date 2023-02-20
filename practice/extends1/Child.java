package extends1;

public class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor");
    }

    @Override
    public void printProtectedName() {
        System.out.println("Parent printProtectedName()");
    }
}
