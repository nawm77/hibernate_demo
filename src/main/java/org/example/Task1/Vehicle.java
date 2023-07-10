//package org.example.Task1;
//
//import jakarta.persistence.*;
//
//import java.math.BigDecimal;
//
//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//abstract class Vehicle {
//    public Vehicle() {
//        this.type = this.getClass().getSimpleName();
//    }
//
//    public Vehicle(String type, String model, BigDecimal price, String fuelType) {
//        this.type = type;
//        this.model = model;
//        this.price = price;
//        this.fuelType = fuelType;
//    }
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE)
//    private Long id;
//    private String type;
//    private String model;
//    private BigDecimal price;
//    private String fuelType;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    public String getFuelType() {
//        return fuelType;
//    }
//
//    public void setFuelType(String fuelType) {
//        this.fuelType = fuelType;
//    }
//}
