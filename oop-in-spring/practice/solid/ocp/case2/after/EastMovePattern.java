// EastMovePattern.java
public class EastMovePattern extends PathPattern {
    
    @Override
    public int nextX() {
        return x += 4;
    }

    @Override
    public int nextY() {
        return y;
    }
}
