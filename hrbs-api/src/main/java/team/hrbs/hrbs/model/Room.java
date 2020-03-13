package team.hrbs.hrbs.model;


import java.util.Date;

public class Room {

    private String name;
    private String id;
    private double price;
    private int periodOfStay;
    private int capacity;

    public Room(String name, double price, int periodOfStay, int capacity) {
        this.name = name;
        this.price = price;
        this.periodOfStay = periodOfStay;
        this.capacity = capacity;
    }

    public Room() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPeriodOfStay() {
        return periodOfStay;
    }

    public void setPeriodOfStay(int periodOfStay) {
        this.periodOfStay = periodOfStay;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}