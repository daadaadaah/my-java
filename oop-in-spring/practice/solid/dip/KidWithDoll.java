public class KidWithDoll {
    Doll doll;

    private int age;

    public KidWithDoll(int age) {
        this.age = age;
        this.doll = new Doll();
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void grow() {
        this.age++;
    }

    void play() {
        System.out.println("아이가 " + doll.getName() + "을 가지고 놀고 있어요");
        doll.talk();
    }
}
