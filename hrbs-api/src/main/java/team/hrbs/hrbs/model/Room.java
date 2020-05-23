package team.hrbs.hrbs.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String roomNo;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RoomType type;

    @Column(nullable = false)
    private long pricePerNight;

    @Column(nullable = false)
    private int capacity;

    @OneToOne(cascade = CascadeType.ALL)
    private Booking booking;

    public Room(String roomNo, RoomType type, int capacity, long pricePerNight) {
        this.roomNo = roomNo;
        this.type = type;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
    }

    public Room() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public long getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(long pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        if (booking != null) {
            this.booking = booking;
            booking.setRoom(this);
        }
    }

    public boolean isBooked() {
        return booking != null;
    }


}
