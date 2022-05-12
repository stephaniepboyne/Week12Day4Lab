package Rooms;

import People.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {

    private int RoomNumber;
    private RoomType roomType;
    private int nightlyRate;

    public Bedroom( int roomNumber, RoomType roomType) {
        super(roomType.getValue());
        RoomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = roomType.getValue() * 20;

    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        RoomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(int nightlyRate) {
        this.nightlyRate = nightlyRate;
    }
}
