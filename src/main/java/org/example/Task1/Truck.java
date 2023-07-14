package org.example.Task1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "Truck")
public class Truck extends Vehicle {
    private final static String type = "Truck";
    @Column(name = "load_capacity")
    private Double load_capacity;

    public Truck() {
    }

    public Truck(String fuel_type, BigDecimal price, String model, Double load_capacity) {
        super(type, fuel_type, price, model);
        this.load_capacity = load_capacity;
    }
}
