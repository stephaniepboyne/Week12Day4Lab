package Rooms;

public class DiningRoom extends Room{

    private String name;

    public DiningRoom(String name) {
        super(RoomType.DINING.getValue());
        this.name = name;
    }
}
