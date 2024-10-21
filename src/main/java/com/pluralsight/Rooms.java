package com.pluralsight;

public class Rooms {
    private String numOfBeds;
    private double price;
    private String isOccupied;
    private String isDirty;
    private String isAvailable;


    public Rooms(String beds, double price, String isOccupied, String isDirty, String isAvailable){
        this.numOfBeds =  beds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    public String getBeds() {
        return numOfBeds;
    }

    public void setBeds(String beds) {
        this.numOfBeds = beds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getIsOccupied() {
        return isOccupied;
    }
    public void setIsOccupied(String isOccupied) {
        this.isOccupied = isOccupied;
    }
    public String getIsDirty() {
        return isDirty;
    }
    public void setIsDirty(String isDirty) {
        this.isDirty = isDirty;
    }
    public String getIsAvailable() {
        return isAvailable;
    }
    public void setIsAvailable(String isAvailable){
        this.isAvailable = isAvailable;
    }
}
