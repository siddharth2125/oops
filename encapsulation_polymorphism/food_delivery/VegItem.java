public class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }
    @Override public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    @Override public double applyDiscount() { return 0; }
    @Override public String getDiscountDetails() { return "No discount"; }
}
