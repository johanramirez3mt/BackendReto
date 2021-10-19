package backendReto.repository;

import backendReto.model.Boat;
import backendReto.repository.crud.BoatCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoatRepository {

    @Autowired
    BoatCrudRepository boatCrudRepository;

    public List<Boat> obtenerBoat(){
        return (List<Boat>)boatCrudRepository.findAll();
    }

    public Boat crearBoat(Boat boat) {
        return boatCrudRepository.save(boat);
    }
}
