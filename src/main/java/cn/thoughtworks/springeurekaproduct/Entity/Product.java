package cn.thoughtworks.springeurekaproduct.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

    private Integer id;
    private String name;
    private Double price;
    private String unit;
}
