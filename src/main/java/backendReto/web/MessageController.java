package backendReto.web;


import backendReto.model.Message;
import backendReto.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/all")
    public List<Message> getMessage() {
        return messageService.obtenerMessage();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message postMessage(@RequestBody Message message){

        return messageService.crearMessage(message);
    }
}
