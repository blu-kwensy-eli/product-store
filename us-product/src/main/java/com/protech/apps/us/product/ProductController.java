package com.protech.apps.us.product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @RequestMapping("/")
    String hello() {
        return "Hello World from product service!";
    }

}
