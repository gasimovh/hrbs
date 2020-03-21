package team.hrbs.hrbs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Room {

    @Id
    private UUID id;
    private String name;
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
