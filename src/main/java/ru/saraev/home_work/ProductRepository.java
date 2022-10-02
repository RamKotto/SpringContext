package ru.saraev.home_work;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Primary
public class ProductRepository implements Repository{

    private List<Product> products;

    @PostConstruct
    public void init() {
        this.products = new ArrayList<>(Arrays.asList(
                new Product(1L, "Milk", 80),
                new Product(2L, "Bread", 30),
                new Product(3L, "Potato", 100),
                new Product(4L, "Onion", 10),
                new Product(5L, "Sugar", 20)
        ));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product getById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();
    }
}
