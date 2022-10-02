package ru.saraev.context;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope("prototype")    // singleton : prototype : session
public class Cat {

    private String color;

    public Cat() {

    }

    public Cat(String color) {
        this.color = color;
    }

    @PostConstruct
    public void init() {
        this.color = "Black";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                '}';
    }
}
