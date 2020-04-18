package team.hrbs.hrbs.db;

import org.springframework.data.jpa.repository.JpaRepository;
import team.hrbs.hrbs.model.Booking;
import team.hrbs.hrbs.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BookingRepository extends JpaRepository<Booking, UUID> {
}