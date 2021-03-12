public class Cat implements Competitor {
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Cat(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean jump(int distance) {
        System.out.println("Cat attempts jump!");
        return maxJumpHeight >= distance;
    }

    @Override
    public boolean run(int distance) {
        System.out.println("Cat attempts run!");
        return maxRunDistance >= distance;
    }
}
