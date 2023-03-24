public class Bedroom implements Room{
    @Override
    public void clean(Robot robot) {
        System.out.println("Робот протирает пол");
        robot.addTime(5);
    }

    @Override
    public String getName() {
        return "спальне";
    }
}
