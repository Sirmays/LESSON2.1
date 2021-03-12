public class Robot implements Competitor {
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Robot(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean jump(int distance) {
        System.out.println("Robot attempts jump!");
        return maxJumpHeight >= distance;
    }

    @Override
    public boolean run(int distance) {
        System.out.println("Robot attempts run!");
        return maxRunDistance >= distance;

    }
}