package cn.thoughtworks.springeurekaproduct.controller;

import cn.thoughtworks.springeurekaproduct.Entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{id}")
    public ResponseEntity<Product> get(@PathVariable Integer id) {
        return ResponseEntity.ok(
                Product.builder()
                        .id(id)
                        .name("某商品")
                        .price(99999.99)
                        .unit("件")
                        .build()
        );
    }
}
