public class Enemy extends Character {
    
    @Override
    public void draw() {
        System.out.println("Enemy를 표시합니다.");
    }

    @Override
    public void drawSpecific() {
        System.out.println("Enemy 마스크도 표시합니다.");
    }
}
