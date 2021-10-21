package backendReto.web;


import backendReto.model.Boat;
import backendReto.service.BoatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Boat")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class BoatController {

    @Autowired
    BoatService boatService;

    @GetMapping("/all")
    public List<Boat> getBoat() {
        return boatService.obtenerBoat();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Boat postBoat(@RequestBody Boat boat){

        return boatService.crearBoat(boat);
    }
}
