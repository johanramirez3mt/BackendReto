package backendReto.service;

import backendReto.model.Message;
import backendReto.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public List<Message> obtenerMessage() {
        return messageRepository.obtenerMessage();
    }

    public Message crearMessage(Message message) {
        return messageRepository.crearMessage(message);
    }
}
