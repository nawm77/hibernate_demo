package org.example.Task3;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
@DiscriminatorValue(value = "Bike")
public class Bike extends Vehicle{
    private final static String type = "Bike";
    public Bike(String fuel_type, BigDecimal price, String model) {
        super(type, fuel_type, model, price);
    }

    public Bike() {
    }
}
