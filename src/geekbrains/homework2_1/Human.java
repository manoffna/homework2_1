package geekbrains.homework2_1;

public class Human implements Competition{
    private String name;
    private int runDistance;
    private int jumpHeight;
    //private int h;

    public Human() {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void jump(String name, int jumpHeight) {
        Wall wall = new Wall();
        wall.getH();
        if (jumpHeight >= wall.getH()) System.out.println(name + " перепрыгнул препятствие высотой " + wall.getH());
        else System.out.println (name + " не допрыгнул");
    }

    @Override
    public void run(String name, int runDistance) {
        Track track = new Track();
        if (runDistance >= track.getD()) System.out.println(name + " пробежал трек длиной " + track.getD());
        else System.out.println (name + " не добежал");
    }


    public int getRunDistance() {
        return runDistance;
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

}
