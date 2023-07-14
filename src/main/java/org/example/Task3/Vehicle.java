package org.example.Task3;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "vehicle")
@DiscriminatorColumn(name = "DTYPE")
abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "type", updatable = false, nullable = false)
    private String DTYPE;
    @Column(name = "fuel_type", nullable = false)
    private String fuel_type;
    @Column(name = "price", scale = 2, precision = 19, nullable = false)
    private BigDecimal price;
    @Column(name = "model", nullable = false)
    private String model;

    public Vehicle(String type, String fuel_type, BigDecimal price, String model) {
        this.DTYPE = type;
        this.fuel_type = fuel_type;
        this.price = price;
        this.model = model;
    }
    public Vehicle(){}
}
