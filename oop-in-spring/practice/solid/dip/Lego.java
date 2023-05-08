public class Lego extends AbstractToy {
    public Lego() {
        super("lego");
    }

    @Override
    public void play() {
        this.assemble();
    }

    public void assemble() {
        System.out.println("레고가 조립되었어요");
    }
}
