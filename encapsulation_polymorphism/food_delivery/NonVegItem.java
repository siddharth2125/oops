public class NonVegItem extends FoodItem implements Discountable {
    private double nonVegCharge = 20; // extra charge per item
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }
    @Override public double calculateTotalPrice() { return (getPrice() + nonVegCharge) * getQuantity(); }
    @Override public double applyDiscount() { return 0; }
    @Override public String getDiscountDetails() { return "No discount"; }
}
