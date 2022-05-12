package Rooms;


import People.Guest;

import java.util.ArrayList;

public abstract class Room{

    private int capacity;
    private ArrayList<Guest> collection;

    public Room(int capacity) {
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<Guest> collection) {
        this.collection = collection;
    }

    public void addGuest(Guest guest){
        if (this.collection.size() < this.capacity){
            this.collection.add(guest);
        }

    }

    public void removeGuest(Guest guest){
        this.collection.remove(guest);
    }

    public int getCollectionSize(){
        return this.collection.size();
    }


}