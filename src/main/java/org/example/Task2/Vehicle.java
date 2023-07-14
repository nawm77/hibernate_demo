package org.example.Task2;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "vehicle")
abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "type", updatable = false, nullable = false)
    private String type;
    @Column(name = "fuel_type", nullable = false)
    private String fuel_type;
    @Column(name = "price", scale = 2, precision = 19, nullable = false)
    private BigDecimal price;
    @Column(name = "model", nullable = false)
    private String model;

    public Vehicle(String type, String fuel_type, BigDecimal price, String model) {
        this.type = type;
        this.fuel_type = fuel_type;
        this.price = price;
        this.model = model;
    }
    public Vehicle(){}
}
