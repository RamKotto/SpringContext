package ru.saraev.home_work;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private Repository repository;

    public String getTitleById(Long id) {
        return repository.getById(id).getTitle();
    }

    public List<Product> showAllProducts() {
        return repository.getAll();
    }
}
