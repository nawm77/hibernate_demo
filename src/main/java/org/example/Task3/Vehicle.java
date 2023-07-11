package org.example.Task3;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "DTYPE")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Column(insertable = false, updatable = false)
    private String DTYPE;
    private String fuel_type;
    private String model;
    private BigDecimal price;
    private String type;
    private String airline;
    private Integer passenger_capacity;
    private Integer seats;
    private Double load_capacity;
    public Vehicle(){}

    public Vehicle(Long id, String DTYPE, String fuel_type, String model, BigDecimal price, String type, String airline, Integer passenger_capacity, Integer seats, Double load_capacity) {
        this.id = id;
        this.DTYPE = DTYPE;
        this.fuel_type = fuel_type;
        this.model = model;
        this.price = price;
        this.type = type;
        this.airline = airline;
        this.passenger_capacity = passenger_capacity;
        this.seats = seats;
        this.load_capacity = load_capacity;
    }
}
