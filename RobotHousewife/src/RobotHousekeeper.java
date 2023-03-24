import java.util.Random;
import java.util.Scanner;

public class RobotHousekeeper {

    public static void main(String[] args) throws InterruptedException {
        Room[] rooms = new Room[5];
        rooms[0] = new Kitchen();
        rooms[1] = new Bedroom();
        rooms[2] = new LivingRoom();
        rooms[3] = new Bathroom();
        rooms[4] = new Hallway();

        Robot robot = new Robot(rooms);

        System.out.println("Добро пожаловать в дом робота-домохозяйки!");

        while (true) {
            System.out.println();
            Room currentRoom = robot.getCurrentRoom();
            System.out.println("Робот находится в " + currentRoom.getName());
            currentRoom.clean(robot);
            System.out.println("Выберите комнату для уборки (введите номер от 0 до 4 или введите r для случайного выбора):");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("r")) {
                Random random = new Random();
                int randomRoomNumber = random.nextInt(5);
                robot.moveToRoom(rooms[randomRoomNumber]);
            } else {
                int roomNumber = Integer.parseInt(input);
                robot.moveToRoom(rooms[roomNumber]);
            }
            if (robot.getTime() > 60) {
                System.out.println("Робот убрал всю квартиру за меньше, чем за минуту!");
                break;
            }
        }
    }
}
