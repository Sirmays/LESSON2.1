public class Treadmill implements Obstacle {
    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean actWithMe(Competitor competitor) {
        return competitor.run(length);
    }
}
