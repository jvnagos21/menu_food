package com.example.menu_food.food;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "foods")
@Entity(name = "foods")

public class Food {
    private Long id;
    private String title;
    private Integer price;
}

