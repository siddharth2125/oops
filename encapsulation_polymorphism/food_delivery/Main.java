public class Main {
    public static void main(String[] args) {
        FoodItem[] order = new FoodItem[] {
            new VegItem("Paneer Butter Masala", 200, 1),
            new NonVegItem("Chicken Biryani", 250, 2)
        };

        for (FoodItem f : order) {
            f.getItemDetails();
            if (f instanceof Discountable) {
                System.out.println("  Discount: " + ((Discountable)f).applyDiscount());
            }
        }
    }
}
