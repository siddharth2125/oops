public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int qty) { this.itemName=name; this.price=price; this.quantity=qty; }

    public abstract double calculateTotalPrice(); // includes extra charges

    public void getItemDetails() {
        System.out.println(itemName + " x" + quantity + " -> " + calculateTotalPrice());
    }

    // Encapsulation
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int q) { this.quantity = q; }
}
