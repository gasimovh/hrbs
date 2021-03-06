package team.hrbs.hrbs.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.hrbs.hrbs.model.Room;
import team.hrbs.hrbs.model.User;

import java.util.List;
import java.util.UUID;

@Repository
public interface RoomRepository extends JpaRepository<Room, UUID> {

}
