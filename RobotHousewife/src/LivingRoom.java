public class LivingRoom implements  Room{
    @Override
    public void clean(Robot robot) {
        System.out.println("Робот убирает игрушки");
        robot.addTime(5);
    }

    @Override
    public String getName() {
        return "гостиной";
    }
}
