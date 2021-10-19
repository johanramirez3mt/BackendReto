package backendReto.service;

import backendReto.model.Client;
import backendReto.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> obtenerClient() {
        return clientRepository.obtenerClient();
    }

    public Client crearClient(Client client) {
        return clientRepository.crearClient(client);
    }
}
