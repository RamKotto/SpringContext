package ru.saraev.context;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component(value = "trueRepository")
@Primary
public class InMemoryRepository implements Repository {

    // inMemoryRepository  - название бина в контексте, можно заменить с поощью аннотации @Component

    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>(Arrays.asList(
                new Product(1L, "Milk", 100),
                new Product(2L, "Bread", 30),
                new Product(3L, "Potato", 150)
        ));
    }

    @Override
    public Product findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();
    }
}
