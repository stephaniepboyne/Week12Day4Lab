package Rooms;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    FAMILY(4),
    CONFERENCE(30),
    DINING(50);

    private final int value;

    RoomType(int value) {
        this.value = value;
    }

    public int getValue() { //UPDATES
        return this.value;
    }

}