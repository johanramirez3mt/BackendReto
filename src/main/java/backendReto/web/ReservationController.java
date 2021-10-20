package backendReto.web;


import backendReto.model.Reservation;
import backendReto.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getReservation() {
        return reservationService.obtenerReservation();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation postReservation(@RequestBody Reservation reservation){

        return reservationService.crearReservation(reservation);
    }
}