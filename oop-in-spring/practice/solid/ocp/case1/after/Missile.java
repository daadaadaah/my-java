public class Missile extends Character {
    
    @Override
    public void draw() {
        System.out.println("Missile를 표시합니다.");
        drawSpecific();
    }

    @Override
    public void drawSpecific() {
        System.out.println("Missile 꼬리도 표시합니다.");
    }
}
