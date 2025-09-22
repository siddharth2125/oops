public class Groceries extends Product {
    public Groceries(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return 0; } // no discount example
}
