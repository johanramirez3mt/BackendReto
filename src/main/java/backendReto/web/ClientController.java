package backendReto.web;

import backendReto.model.Client;
import backendReto.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/all")
    public List<Client> getClient() {
        return clientService.obtenerClient();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client postClient(@RequestBody Client client){

        return clientService.crearClient(client);
    }
}
