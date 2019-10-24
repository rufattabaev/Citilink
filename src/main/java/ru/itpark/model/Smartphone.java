package ru.itpark.model;

public class Smartphone extends Product {
    private String brand;
    private int memoryInGb;
    private int camera;
    private int battery;

    public Smartphone(long id, String imageUrl, String name, String stars, int price, boolean ableToBeAddedInBasket, String category, String brand, int memoryInGb, int camera, int battery) {
        super(id, imageUrl, name, stars, price, ableToBeAddedInBasket, category);
        this.brand = brand;
        this.memoryInGb = memoryInGb;
        this.camera = camera;
        this.battery = battery;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemoryInGb() {
        return memoryInGb;
    }

    public void setMemoryInGb(int memoryInGb) {
        this.memoryInGb = memoryInGb;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Name " + getName() +
                " Price" + getPrice() +
                " Smartphone{" +
                "brand='" + brand + '\'' +
                ", memoryInGb=" + memoryInGb +
                ", camera=" + camera +
                ", battery=" + battery +
                '}';
    }
}
