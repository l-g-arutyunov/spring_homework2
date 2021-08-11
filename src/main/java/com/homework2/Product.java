package com.homework2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

public class Product {
    @Getter
    private String name;

    public Product(String name) {
        this.name = name;
    }
}
