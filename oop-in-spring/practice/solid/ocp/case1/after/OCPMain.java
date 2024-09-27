public class OCPMain {

    public static void main(String[] args) {
        OCPMain ocpMain = new OCPMain();

        Character player = new Player();
        ocpMain.drawCharacter(player);

        Character enemy = new Enemy();
        ocpMain.drawCharacter(player);

        Character missile = new Missile();
        ocpMain.drawCharacter(missile);
    }
    
    public void drawCharacter(Character character) {
        character.draw();
        character.drawSpecific(); // draw() 안에서 호출해줘도 되는 됨. 지금은 변화 대상을 추상화 시키는 연습을 하고 있으므로, 일단 밖으로 뺌
    }
}