package team.hrbs.hrbs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.hrbs.hrbs.db.RoomRepository;
import team.hrbs.hrbs.model.Room;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class RoomController {

    private RoomRepository roomRepository;

    public RoomController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @RequestMapping("/")
    public String index() {
        return "Hello there! I'm running.";
    }

}
