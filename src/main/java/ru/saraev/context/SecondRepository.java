package ru.saraev.context;

import org.springframework.stereotype.Component;

@Component(value = "falseRepository")
public class SecondRepository implements Repository {
    @Override
    public Product findById(Long id) {
        throw new RuntimeException("Был вызван второй репозиторий");
    }
}
