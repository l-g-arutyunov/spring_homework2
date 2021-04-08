package com.homework2;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    private ProductRepository productRepository;
    @Getter
    private List<Product> productsInCart = new ArrayList<>();

    @Autowired
    public Cart(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void putInCart(int id) {
        productsInCart.add(productRepository.getProduct(id));
    }

    public void removeProductFromCart(int id) {
        productsInCart.remove(productRepository.getProduct(id));
//        Product productOfRemove = productRepository.getProduct(id);
//        for (int i = productsInCart.size()-1; i >= 0; i--) {
//            if (productsInCart.get(i) == productOfRemove) {
//                productsInCart.
//            }
//        }
    }

}
