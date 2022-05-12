import Admin.Booking;
import HotelPackage.Hotel;
import People.Guest;
import Rooms.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Bedroom bedroom;
    private Guest guest;
    private Hotel hotel;
    private ConferenceRoom conferenceRoom;
    private DiningRoom diningRoom;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private Booking bookingDefault;


    @Before
    public void before(){
        bedroom = new Bedroom(20, RoomType.DOUBLE);
        bedroom1 = new Bedroom(21, RoomType.SINGLE);
        bedroom2 = new Bedroom(22, RoomType.TRIPLE);
        bedroom3 = new Bedroom(23, RoomType.DOUBLE);
        conferenceRoom = new ConferenceRoom("Name");
        guest = new Guest("Name");
        diningRoom = new DiningRoom("Breakfast Room");
        hotel = new Hotel();
        hotel.addBedroom(bedroom);
        hotel.addConferenceRoom(conferenceRoom);
        bookingDefault = new Booking(bedroom, 2, 2);

    }

    @Test
    public void canCheckIn(){
        hotel.checkGuestIn(guest, bedroom, bookingDefault);
        assertEquals(1, bedroom.getCollectionSize());
    }

    @Test
    public void canCheckOut(){
        hotel.checkGuestIn(guest, bedroom, bookingDefault);
        hotel.checkOutGuest(guest, bedroom);
        assertEquals(0, bedroom.getCollectionSize());
    }

    @Test
    public void cannotCheckInBedroomOccupied(){
        hotel.checkGuestIn(guest, bedroom, bookingDefault);
        hotel.checkGuestIn(guest, bedroom, bookingDefault);
        assertEquals(1, bedroom.getCollectionSize());
    }

//    @Test
//    public void cannotCheckInTooManyGuests(){
//        hotel.checkGuestIn(guest, bedroom);
//        hotel.checkGuestIn(guest, bedroom);
//        hotel.checkGuestIn(guest, bedroom);
//        assertEquals(2, bedroom.getCollectionSize());
//    }

    @Test
    public void cannotCheckOut(){
        hotel.checkOutGuest(guest, bedroom);
        assertEquals(0, bedroom.getCollectionSize());
    }

    @Test
    public void testBookRoom(){
        Booking booking = hotel.bookRoom(bedroom, 2, 2);
        assertEquals(80, booking.bill());
    }


    @Test
    public void testAddDingingRoom(){
        hotel.addDiningRoom(diningRoom, "breakfast");
        assertEquals(1, hotel.getDiningRoomsSize());
    }

    @Test
    public void testRemoveDiningRoom(){
        hotel.addDiningRoom(diningRoom, "breakfast");
        hotel.addDiningRoom(diningRoom, "lunch");
        hotel.addDiningRoom(diningRoom,"dinner");
        hotel.removeDiningRoom("breakfast");
        assertEquals(2, hotel.getDiningRoomsSize());
    }

    @Test
    public void testGetVacantBedrooms(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.checkGuestIn(guest, bedroom1, bookingDefault);
        hotel.checkGuestIn(guest, bedroom2, bookingDefault);
        assertEquals(2, hotel.getVacantBedrooms().size());
    }

    @Test
    public void testCheckInTooManyPeople(){
        hotel.addBedroom(bedroom2);
        hotel.checkGuestIn(guest, bedroom2, bookingDefault);
        hotel.checkGuestIn(guest, bedroom2, bookingDefault);
        hotel.checkGuestIn(guest, bedroom2, bookingDefault);
        assertEquals(2, bedroom2.getCollectionSize());
    }


}
