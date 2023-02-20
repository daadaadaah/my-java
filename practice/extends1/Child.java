package extends1;

public class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor");
    }
    
    @Override
    void printProtectedName() { //  attempting to assign weaker access privileges ('package-private'); was 'protected' 라고 하면서 에러 남!
        System.out.println("Parent printProtectedName()");
    }
}
