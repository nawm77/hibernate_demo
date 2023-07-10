package org.example.Task2;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
public class Plane extends Vehicle{
    private final static String type = "Plane";
    private String airline;
    private Integer passenger_capacity;

    public Plane(String fuel_type, BigDecimal price, String model, String airline, Integer passenger_capacity) {
        super(type, fuel_type, price, model);
        this.airline = airline;
        this.passenger_capacity = passenger_capacity;
    }

    public Plane() {}
}
