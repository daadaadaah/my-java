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
        if (character instanceof Missile) {
            Missile missile = (Missile) character;
            missile.drawSpecific();
        } else {
            character.draw();
        }
        
    }
}