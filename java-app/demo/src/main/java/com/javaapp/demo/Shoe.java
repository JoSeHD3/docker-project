package com.javaapp.demo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@SuppressWarnings("java:S5961")

@Document(collection = "shoes")
public class Shoe {

    @Id
    private String id;
    private int size;
    private String color;
    private String model;
    private String producer;
    private double price;
    
    public Shoe(String id, int size, String color, String model, String producer, double price) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.model = model;
        this.producer = producer;
        this.price = price;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}