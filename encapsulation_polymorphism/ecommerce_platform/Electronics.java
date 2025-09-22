public class Electronics extends Product implements Taxable {
    public Electronics(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice() * 0.05; } // 5%
    @Override public double calculateTax() { return getPrice() * 0.18; } // 18%
    @Override public String getTaxDetails() { return "GST 18%"; }
}
