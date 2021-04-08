package com.homework2.config;

import com.homework2.Cart;
import com.homework2.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.homework2")
public class JavaConfig {


//    public class AppConfiguration {
//
//        @Bean
//        Cart cart(ProductRepository productRepository){
//            return new Cart(productRepository);
//        }

//    }

}
