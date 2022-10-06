package ru.saraev.home_work;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.saraev.home_work");

        ProductService productService = context.getBean(ProductService.class);
        Cart cart1 = context.getBean(Cart.class);
        Cart cart2 = context.getBean(Cart.class);

        System.out.println(productService.getTitleById(1L));
        System.out.println(productService.getTitleById(2L));

        cart1.showCart();
        cart2.showCart();

        cart1.addProduct(1L);
        cart2.addProduct(2L);

        cart1.showCart();
        cart2.showCart();

        System.out.println(productService.showAllProducts());

        context.close();
    }
}
