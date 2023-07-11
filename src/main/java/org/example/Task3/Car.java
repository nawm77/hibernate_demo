package org.example.Task3;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
@DiscriminatorValue(value = "Car")
public class Car extends Vehicle{
    private final static String type = "Car";
    private Integer seats;

    public Car(String fuel_type, BigDecimal price, String model, Integer seats) {
        super(type, fuel_type, model, price);
        this.seats = seats;
    }

    public Car() {
    }
}
