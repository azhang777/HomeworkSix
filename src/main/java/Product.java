public abstract class Product {
    private String name;
    private double price;
    private int quantityOrder;

    public Product(String name, double price, int quantityOrder) {
        this.name = name;
        this.price = price;
        this.quantityOrder = quantityOrder;
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

    public int getQuantityOrder() {
        return quantityOrder;
    }

    public void setQuantityOrder(int quantityOrder) {
        this.quantityOrder = quantityOrder;
    }
}
