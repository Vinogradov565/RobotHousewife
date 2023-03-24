public class Robot {
    private Room currentRoom;
    private Room[] rooms;
    private int time;
    private long lastCleanTime;

    public Robot(Room[] rooms) {
        this.rooms = rooms;
        currentRoom = rooms[0];
    }

    public void moveToRoom(Room room) {
        if (room.equals(currentRoom)) {
            if (System.currentTimeMillis() - lastCleanTime < 60000) {
                System.out.println("Робот уже убирался в этой комнате меньше минуты назад. Выберите другую комнату.");
                return;
            }
        }
        currentRoom = room;
        lastCleanTime = System.currentTimeMillis();
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void addTime(int time) {
        this.time += time;
    }

    public int getTime() {
        return time;
    }
}
