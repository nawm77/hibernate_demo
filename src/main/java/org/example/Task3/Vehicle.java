package org.example.Task3;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Column(insertable = false, updatable = false)
    private String DTYPE;
    private String fuel_type;
    private String model;
    private BigDecimal price;
    public Vehicle(){}

    public Vehicle(String DTYPE, String fuel_type, String model, BigDecimal price) {
        this.DTYPE = DTYPE;
        this.fuel_type = fuel_type;
        this.model = model;
        this.price = price;
    }
}
