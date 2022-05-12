import Admin.Booking;
import Rooms.Bedroom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Bedroom bedroom;
    private Booking booking;

    @Before
    public void before(){
        bedroom = new Bedroom(20, RoomType.DOUBLE);
        booking = new Booking(bedroom, 2, 2);
    }

    @Test
    public void testBill(){
        assertEquals(80, booking.bill());
    }


}
