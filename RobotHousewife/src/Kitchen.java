public class Kitchen implements Room{
    @Override
    public void clean(Robot robot) {
        System.out.println("Робот моет посуду");
        robot.addTime(5);
    }

    @Override
    public String getName() {
        return "кухне";
    }
}
