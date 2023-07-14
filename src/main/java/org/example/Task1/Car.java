package org.example.Task1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "Car")
public class Car extends Vehicle {
    private final static String type = "Car";
    @Column(name = "seats")
    private Integer seats;

    public Car(String fuel_type, BigDecimal price, String model, Integer seats) {
        super(type, fuel_type, price, model);
        this.seats = seats;
    }
    public Car() {
    }
}
