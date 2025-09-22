public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[] {
            new Electronics("E100", "Headphones", 1500),
            new Clothing("C200", "T-Shirt", 500),
            new Groceries("G300", "Rice 5kg", 2000)
        };

        for (Product p : products) {
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - p.calculateDiscount();
            System.out.println(p.getName() + " -> Base: " + p.getPrice() + ", Tax: " + tax + ", Discount: " + p.calculateDiscount() + ", Final: " + finalPrice);
        }
    }
}
