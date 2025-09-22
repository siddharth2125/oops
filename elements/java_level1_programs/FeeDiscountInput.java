import java.util.*;

class FeeDiscountInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the course fee: ");
        double fee = input.nextDouble();

        System.out.print("Enter discount percent: ");
        double discountPercent = input.nextDouble();

        double discountAmount = (fee * discountPercent) / 100;
        double finalFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount +
                           " and final discounted fee is INR " + finalFee);
    }
}
