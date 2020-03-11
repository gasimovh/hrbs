package team.hrbs.hrbs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.hrbs.hrbs.model.Room;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value="/rooms")
public class RoomController {
    List<Room> rooms;

    public RoomController(){
        rooms = new ArrayList<>();

        rooms.add(new Room("DNS", 500, 2, 2));
        rooms.add(new Room("MNS", 200, 1, 4));
        rooms.add(new Room("JNS", 40, 2, 8));
        rooms.add(new Room("YNS", 10, 1, 8));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Room> getAllRooms(){
        return rooms;
    }
}
