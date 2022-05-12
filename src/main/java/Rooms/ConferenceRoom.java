package Rooms;

import People.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room{

    private String name;


    public ConferenceRoom(String name) {
        super(RoomType.CONFERENCE.getValue());
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

