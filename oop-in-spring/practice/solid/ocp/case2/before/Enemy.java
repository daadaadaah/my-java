public class Enemy extends Character {
    private int pathPattern;

    public Enemy(int pathPattern) {
        this.pathPattern = pathPattern;
    }
    
    @Override
    public void draw() {
        int x;
        int y;

        if(pathPattern == 1) {
            x += 4;
        } else if(pathPattern == 2) {
            y += 10;
        } else if(pathPattern == 4) {
            x += 4;
            y += 10;
        }
        
        // .. 그려주는 코드
    }
}
