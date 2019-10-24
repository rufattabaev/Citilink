package ru.itpark.model;

public class Product {
    private long id;
    private String imageUrl;
    private String name;
    private String stars;
    private int price;
    private boolean ableToBeAddedInBasket;
    private String category;

    public Product(long id, String imageUrl, String name, String stars, int price, boolean ableToBeAddedInBasket, String category) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.stars = stars;
        this.price = price;
        this.ableToBeAddedInBasket = ableToBeAddedInBasket;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAbleToBeAddedInBasket() {
        return ableToBeAddedInBasket;
    }

    public void setAbleToBeAddedInBasket(boolean ableToBeAddedInBasket) {
        this.ableToBeAddedInBasket = ableToBeAddedInBasket;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                ", name='" + name + '\'' +
                ", stars='" + stars + '\'' +
                ", price=" + price +
                ", ableToBeAddedInBasket=" + ableToBeAddedInBasket +
                ", category='" + category + '\'' +
                '}';
    }
}
