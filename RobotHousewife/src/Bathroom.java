public class Bathroom implements Room{
    @Override
    public void clean(Robot robot) {
        System.out.println("Робот чистит ванную комнату");
        robot.addTime(5);
    }

    @Override
    public String getName() {
        return "ванной";
    }
}
