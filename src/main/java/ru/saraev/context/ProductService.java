package ru.saraev.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class ProductService {

    private Repository repository;

    @Autowired
    private FileOutputStream out;

    @Autowired
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public String getTitleById(Long id) {
        return repository.findById(id).getTitle();
    }

    public void write(String message) throws IOException {
        out.write(message.getBytes());
        out.flush();
    }
}
