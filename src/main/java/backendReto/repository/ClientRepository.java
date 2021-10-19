package backendReto.repository;

import backendReto.model.Client;
import backendReto.repository.crud.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientRepository {

    @Autowired
    ClientCrudRepository clientCrudRepository;

    public List<Client> obtenerClient(){
        return (List<Client>)clientCrudRepository.findAll();
    }

    public Client crearClient(Client client) {
        return clientCrudRepository.save(client);
    }
}
