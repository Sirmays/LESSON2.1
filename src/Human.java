public class Human implements Competitor {
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Human(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean jump(int distance) {
        System.out.println("Human attempts jump!");
        return maxJumpHeight >= distance;
    }

    @Override
    public boolean run(int distance) {
        System.out.println("Human attempts run!");
        return maxRunDistance >= distance;

    }
}
