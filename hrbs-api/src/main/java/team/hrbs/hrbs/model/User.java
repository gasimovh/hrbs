package team.hrbs.hrbs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
public class User {

    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @OneToMany
    private List<Room> bookings;
}
