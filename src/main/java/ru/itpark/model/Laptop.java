package ru.itpark.model;

public class Laptop extends Product {
    private int screenResolution;
    private String processor;
    private String operatingSystem;

    public Laptop(long id, String imageUrl, String name, String stars, int price, boolean ableToBeAddedInBasket, String category, int screenResolution, String processor, String operatingSystem) {
        super(id, imageUrl, name, stars, price, ableToBeAddedInBasket, category);
        this.screenResolution = screenResolution;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
    }

    public int getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(int screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Name " + getName() +
                " Price" + getPrice() +
                " Laptop{" +
                "screenResolution=" + screenResolution +
                ", processor='" + processor + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
