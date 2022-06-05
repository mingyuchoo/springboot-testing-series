package com.example.coffee.order.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Application -> Controller -> Service -> Repository -> Entity
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CoffeeEntity {
    private int Id;
    private String name;
}
