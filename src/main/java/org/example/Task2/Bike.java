package org.example.Task2;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "Bike")
public class Bike extends Vehicle{
    private final static String type = "Bike";
    public Bike(String fuel_type, BigDecimal price, String model) {
        super(type, fuel_type, price, model);
    }
    public Bike() {
    }
}
