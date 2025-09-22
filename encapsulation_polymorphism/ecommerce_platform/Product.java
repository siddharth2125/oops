public abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.productId = id; this.name = name; this.price = price;
    }

    public abstract double calculateDiscount(); // e.g., seasonal discount

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; } // encapsulated update
}
