import Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private String name;
    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Conference Room");

    }

    @Test
    public void hasCapacity(){
        assertEquals(30, conferenceRoom.getCapacity());
    }
}
