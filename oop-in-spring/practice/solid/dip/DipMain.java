public class DipMain {
    public static void main(String[] args) {

        /** DIP 준수하지 않은 경우 **/
        // (1) 아이가 인형을 가지고 놀 때
        KidWithDoll kidWithDoll = new KidWithDoll(3);
        kidWithDoll.play();

        kidWithDoll.grow();

        // (2) 아이가 로봇을 가지고 놀 때
        KidWithRobot kidWithRobot = new KidWithRobot(kidWithDoll.getAge());
        kidWithRobot.play();

        kidWithRobot.grow();

        // (3) 아이가 레고를 가지고 놀 때
        KidWithLego kidWithLego = new KidWithLego(kidWithRobot.getAge());
        kidWithLego.play();
    }
}