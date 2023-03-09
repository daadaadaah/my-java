public class Doll extends AbstractToy {

    public Doll() {
        super("doll");
    }

    @Override
    public void play() {
        this.talk();
    }

    public void talk() {
        System.out.println("인형이 말을 합니다.");
    }
}
