public class Wall implements Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean actWithMe(Competitor competitor) {
        return competitor.jump(height);
    }
}
