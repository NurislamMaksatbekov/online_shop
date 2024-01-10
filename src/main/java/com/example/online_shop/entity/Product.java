package com.example.online_shop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "products")
public class Product extends BaseEntity {
    private String title;
    @OneToOne
    private ProductImage productImage;
    private int quantity;
    private String description;
    private double price;
    @ManyToMany(mappedBy = "products")
    private List<Cart> carts;

}
