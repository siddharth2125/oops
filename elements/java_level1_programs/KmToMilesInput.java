import java.util.*;

class KmToMilesInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();

        double milesPerKm = 1.6;
        double miles = kilometers / milesPerKm;

        System.out.println("The total miles is " + miles + " mile for the given " + kilometers + " km");
    }
}
