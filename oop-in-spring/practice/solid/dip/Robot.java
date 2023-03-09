public class Robot extends AbstractToy {

    public Robot() {
        super("robot");
    }

    @Override
    public void play() {
        this.shoot();
    }

    public void shoot() {
        System.out.println("로봇이 총을 쏩니다.");
    }
}
