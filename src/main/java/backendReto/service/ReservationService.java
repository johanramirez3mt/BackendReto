package backendReto.service;

import backendReto.model.Reservation;
import backendReto.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    ReservationRepository reservationRepository;

    public List<Reservation> obtenerReservation() {
        return reservationRepository.obtenerReservation();
    }

    public Reservation crearReservation(Reservation reservation) {
        return reservationRepository.crearReservation(reservation);
    }
}
