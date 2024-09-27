package extends1;

public class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
    }

    public void printName() {
        System.out.println("Parent printName()");
    }

    private void printPrivateName() {
        System.out.println("Parent printPrivateName()");
    }

    protected void printProtectedName() {
        System.out.println("Parent printProtectedName()");
    }
}
