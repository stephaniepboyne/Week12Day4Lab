package HotelPackage;

import Admin.Booking;
import People.Guest;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.DiningRoom;
import Rooms.Room;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;



    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new HashMap<>();


    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(ArrayList<ConferenceRoom> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public void addBedroom(Bedroom bedroom){
        bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        conferenceRooms.add(conferenceRoom);
    }

    public void checkGuestIn(Guest guest, Room room, Booking booking){

        if (booking.getNumberOfGuests() > room.getCollectionSize()){
            room.addGuest(guest);
        }

    }

    public void checkOutGuest(Guest guest, Room room){
        room.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int nights, int guests){
        if(bedroom.getCapacity() <= guests) {
            return new Booking(bedroom, nights, guests);
        }
        return null;
    }

    public void addDiningRoom(DiningRoom diningRoom, String purpose){
        diningRooms.put(purpose, diningRoom);
    }

    public void removeDiningRoom(String purpose){
        diningRooms.remove(purpose);
    }

    public int getDiningRoomsSize(){
        return diningRooms.size();
    }

    public ArrayList<Bedroom> getVacantBedrooms(){
        ArrayList<Bedroom> vacantBedrooms;
        vacantBedrooms = new ArrayList<>();
        for (Bedroom bedroom : bedrooms){
            if (bedroom.getCollectionSize() == 0){
                vacantBedrooms.add(bedroom);
            }
        }
        return vacantBedrooms;
    }




}
