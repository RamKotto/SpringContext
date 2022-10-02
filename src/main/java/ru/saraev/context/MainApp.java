package ru.saraev.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.saraev.context.config.AppConfig;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainApp {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        /*
        Cat cat = context.getBean(Cat.class);
        cat.setColor("White");

        Cat cat2 = context.getBean(Cat.class);
        cat2.setColor("Red");

        System.out.println(cat);
        System.out.println(cat2);
        // Если @Scope("prototype") убрать, то бин будет синглтоном. И equals вернет true. Цвет кошек станет одинаковым.
        System.out.println(cat.equals(cat2));

        Cat cat3 = context.getBean(Cat.class);
        System.out.println(cat3);  // Cat{color='Black'}  добивается за счет аннотации @PostConstruct
        */


        ProductService productService = context.getBean(ProductService.class);
        System.out.println(productService.getTitleById(1L));

        productService.write("Hello ;)");
    }
}
