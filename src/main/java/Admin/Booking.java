package Admin;

import Rooms.Bedroom;

public class Booking {

    private Bedroom bedroom;
    private int numberOfNights;
    private int numberOfGuests;


    public Bedroom getBedroom() {
        return bedroom;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public Booking(Bedroom bedroom, int numberOfNights, int numberOfGuests) {
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
        this.numberOfGuests = numberOfGuests;
    }

    public int bill(){
        return this.bedroom.getNightlyRate() * this.numberOfNights;
    }


}
