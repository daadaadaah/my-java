public class Kid {

    private int age;

    public Kid(int age) {
        this.age = age;
    }

    void play(AbstractToy toy) {
        System.out.println("아이가 " + toy.getName() + "을 가지고 놀고 있어요");
        toy.play();
    }

    void grow() {
        this.age++;
    }
}
