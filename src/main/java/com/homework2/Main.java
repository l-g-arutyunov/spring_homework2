package com.homework2;

import com.homework2.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Cart bean1 = context.getBean("cart", Cart.class);
        System.out.println("Start" + '\n' + "a[id] - add" + '\n' + "r[id] - remove" + '\n' + "sc - show cart" + '\n' + "sr - show repository" + '\n' + "c - close");
        while (true) {
            System.out.println("enter command: ");
            try {
                String s = reader.readLine();
                if (s.substring(0,1).equals("a")) {
                    bean1.putInCart(Integer.parseInt(s.substring(2,3)));
                    continue;
                }
                if (s.substring(0,1).equals("r")) {
                    bean1.removeProductFromCart(Integer.parseInt(s.substring(2,3)));
                    continue;
                }
                if (s.equals("sc")) {
                    List<Product> productList = bean1.getProductsInCart();
                    System.out.println("-----------------------------");
                    for (Product product : productList) {
                        System.out.println(product.getName());
                    }
                    System.out.println("-----------------------------");
                    continue;
                }
                if (s.equals("sr")) {
                    List<Product> productList = context.getBean("productRepository", ProductRepository.class).getProductList();
                    System.out.println("-----------------------------");
                    for (int i = 0; i < productList.size(); i++) {
                        System.out.println(productList.get(i).getName() + " id = " + i);
                    }
                    System.out.println("-----------------------------");
                    continue;
                }
                if (s == "c") {
                    break;
                }
                System.out.println("unknown command");
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(bean1 == context.getBean("cart", Cart.class));

        }
    }
}
