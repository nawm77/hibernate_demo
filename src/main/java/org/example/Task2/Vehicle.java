package org.example.Task2;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String fuel_type;
    private BigDecimal price;
    private String model;

    public Vehicle(String type, String fuel_type, BigDecimal price, String model) {
        this.type = type;
        this.fuel_type = fuel_type;
        this.price = price;
        this.model = model;
    }
    public Vehicle(){}
}
