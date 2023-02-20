package extends1;

public class RunExtends {
  public static void main(String[] args) {
    // 1. 매개변수가 없는 경우
//    Child child = new Child();
//    child.printName();
////    child.printPrivateName(); 불가능!
//    child.printProtectedName();

    // 2. 매개변수가 있는 경우
    ChildArg childArg = new ChildArg();
    childArg.printName();

    // 3. 손자의 경우
    GrandChild grandChild = new GrandChild();
    grandChild.printProtectedName();

    // 4. 상속 구조가 아닌 경우
    Friend friend = new Friend();
//    friend.printProtectedName(); 불가능!
  }
}
