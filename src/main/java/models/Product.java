package models;

public class Product {
    private int id;
    private String name;
    private double price;
    private String img;
    private int amount;


    public Product() {
    }

    public Product(int id, String name, double price, String img, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.img = img;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
