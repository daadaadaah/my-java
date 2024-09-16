public class KidWithRobot {
    Robot robot;

    private int age;

    public KidWithRobot(int age) {
        this.age = age;
        this.robot = new Robot();
    }

    public int getAge() {
        return this.age;
    }

    void grow() {
        this.age++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void play() {
        System.out.println("아이가 " + robot.getName() + "을 가지고 놀고 있어요");
        robot.shoot();
    }
}
