package extends1;

public class RunExtends {
  public static void main(String[] args) {
    Child child = new Child();
    child.printName();
//    child.printPrivateName(); 불가능!
    child.printProtectedName();
  }
}
