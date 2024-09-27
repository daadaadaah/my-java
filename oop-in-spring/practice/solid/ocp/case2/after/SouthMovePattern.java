public class SouthMovePattern extends PathPattern {
    
    @Override
    public int nextX() {
        return x;
    }

    @Override
    public int nextY() {
        return y += 10;
    }
}
