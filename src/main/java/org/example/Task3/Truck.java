package org.example.Task3;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
@DiscriminatorValue(value = "Truck")
public class Truck extends Vehicle {
    private final static String type = "Truck";
    private Double load_capacity;

    public Truck() {
    }

    public Truck(String fuel_type, BigDecimal price, String model, Double load_capacity) {
        super(type, fuel_type, model, price);
        this.load_capacity = load_capacity;
    }
}
