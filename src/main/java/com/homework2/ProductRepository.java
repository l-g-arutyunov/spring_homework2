package com.homework2;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    @Getter
    private List<Product> productList = new ArrayList<>();

    public ProductRepository() {
        productList.add(new Product("Pineapple"));
        productList.add(new Product("Apple"));
        productList.add(new Product("Potato"));
        productList.add(new Product("Lime"));
        productList.add(new Product("Tomato"));
    }

    public Product getProduct(int id) {
        return productList.get(id);
    }


}
