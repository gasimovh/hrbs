package team.hrbs.hrbs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;
import java.util.UUID;
@Entity(name = "Booking")
public class Booking {
    @Id
    private UUID BookingId;
    private UUID room;
    private UUID user;
    private int numberOfPeople;
    private int periodOfStay;

    public Booking(Room room, User user, int numberOfPeople, int periodOfStay) {
        this.user=user.getId();
        this.room = room.getId();
        this.numberOfPeople = numberOfPeople;
        this.periodOfStay = periodOfStay;
        this.BookingId = UUID.randomUUID();
    }
    public Booking(){}

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getPeriodOfStay() {
        return periodOfStay;
    }

    public void setPeriodOfStay(int periodOfStay) {
        this.periodOfStay = periodOfStay;
    }

    public UUID getRoom() {
        return room;
    }

    public void setRooms(Room room) {
        this.room = room.getId();
    }

    public UUID getUser() { return user; }

    public void setUser(User user) { this.user = user.getId(); }
}