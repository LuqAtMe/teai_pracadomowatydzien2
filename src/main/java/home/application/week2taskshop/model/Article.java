package home.application.week2taskshop.model;

public class Article {

    private String name;
    private double price;

    public Article(String name, double price) {
        this.name = name;
        this.price = price;
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

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Article {" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}'+"\n";
    }
}
