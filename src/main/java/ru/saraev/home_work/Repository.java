package ru.saraev.home_work;

import java.util.List;

public interface Repository {

    List<Product> getAll();
    Product getById(Long id);
}
