package ru.saraev.home_work;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {

    private List<Product> cart;

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostConstruct
    public void init() {
        this.cart = new ArrayList<>();
    }

    public void addProduct(Long id) {
        cart.add(productRepository.getById(id));
    }

    public void showCart() {
        cart.forEach(System.out::println);
    }
}
