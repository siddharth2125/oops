public class Clothing extends Product implements Taxable {
    public Clothing(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice() * 0.10; } // 10%
    @Override public double calculateTax() { return getPrice() * 0.05; } // 5%
    @Override public String getTaxDetails() { return "GST 5%"; }
}
