public class Player extends Character {

    @Override
    public void draw() {
        System.out.println("Player를 표시합니다.");
    }

    @Override
    public void drawSpecific() {
        System.out.println("Player 그림자도 표시합니다.");
    }
}