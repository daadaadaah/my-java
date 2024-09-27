public abstract class Character {
    public void draw() {
        System.out.println("Charcter 그리기");
    }

    protected abstract void drawSpecific();
}