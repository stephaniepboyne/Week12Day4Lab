import Rooms.Bedroom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private RoomType roomType;
    private int roomNumber;
    private Bedroom bedroom;

    @Before
    public void before(){
        roomType = RoomType.DOUBLE;
        bedroom = new Bedroom(104, roomType);
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void startsWithEmptyCollection(){
        assertEquals(0, bedroom.getCollectionSize());
    }







}
