package backendReto.service;

import backendReto.model.Boat;
import backendReto.repository.BoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoatService {

    @Autowired
    BoatRepository boatRepository;

    public List<Boat> obtenerBoat() {
        return boatRepository.obtenerBoat();
    }

    public Boat crearBoat(Boat boat) {
        return boatRepository.crearBoat(boat);
    }
}
