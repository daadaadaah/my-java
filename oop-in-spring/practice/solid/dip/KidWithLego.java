public class KidWithLego {
    Lego lego;
    private int age;

    public KidWithLego(int age) {
        this.age = age;
        this.lego = new Lego();
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
        System.out.println("아이가 " + lego.getName() + "을 가지고 놀고 있어요");
        lego.assemble();
    }
}
