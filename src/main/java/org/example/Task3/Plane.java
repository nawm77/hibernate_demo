package org.example.Task3;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
@DiscriminatorValue(value = "Plane")
public class Plane extends Vehicle{
    private final static String type = "Plane";
    private String airline;
    private Integer passenger_capacity;

    public Plane(String fuel_type, BigDecimal price, String model, String airline, Integer passenger_capacity) {
        super(type, fuel_type, model, price);
        this.airline = airline;
        this.passenger_capacity = passenger_capacity;
    }

    public Plane() {}
}
