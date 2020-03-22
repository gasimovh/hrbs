package team.hrbs.hrbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import team.hrbs.hrbs.db.BookingRepository;
import team.hrbs.hrbs.db.UserRepository;
import team.hrbs.hrbs.model.Booking;
import team.hrbs.hrbs.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value="/booking")

public class BookingController {
    private BookingRepository bookingRepository;
    @Autowired
    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Booking> getAll(){
        return bookingRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET)
    public Optional<Booking> find(UUID id){
        return bookingRepository.findById(id);
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public Optional<Booking> find(String firstname, String lastname){
//        return bookingRepository.findAllByUser(UserRepository.findByFirstNameAndLastName(firstname, lastname));
//    }

    @RequestMapping(method = RequestMethod.POST)
    public List<Booking> create(@RequestBody Booking booking){
        bookingRepository.save(booking);
        return bookingRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public List<Booking> delete(@RequestBody UUID id){
        Booking booking = bookingRepository.getOne(id);
        bookingRepository.delete(booking);
        return bookingRepository.findAll();
    }
}
