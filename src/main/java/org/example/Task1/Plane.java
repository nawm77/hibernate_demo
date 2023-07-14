package org.example.Task1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "Plane")
public class Plane extends Vehicle {
    private final static String type = "Plane";
    @Column(name = "airline")
    private String airline;
    @Column(name = "passenger_capacity")
    private Integer passenger_capacity;

    public Plane(String fuel_type, BigDecimal price, String model, String airline, Integer passenger_capacity) {
        super(type, fuel_type, price, model);
        this.airline = airline;
        this.passenger_capacity = passenger_capacity;
    }

    public Plane() {}
}
