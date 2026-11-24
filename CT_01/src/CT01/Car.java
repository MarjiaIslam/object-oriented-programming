package CT01;
import java.util.Scanner;

public class Car {
    private double distance;
    private double fuel;

    public Car(double distance, double fuel) {
        this.distance = distance;
        this.fuel = fuel;
    }

    public double getMileage() {
        return distance / fuel;
    }

    public double getCost() {
        return fuel * 4;
    }

    public int getAverage(int[] fuelCosts) {
        int maxCost = fuelCosts[0];
        for (int cost : fuelCosts) {
            if (cost > maxCost) {
                maxCost = cost;
            }
        }
        return maxCost;
    }
}

class VehicleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance travelled and fuel consumption of car:");
        double distance = scanner.nextDouble();
        double fuel = scanner.nextDouble();

        Car car = new Car(distance, fuel);

        System.out.println("Please enter a choice: \n1. Mileage of Car \n2. Cost of fuel \n3. Maximum Cost");
        int choice = scanner.nextInt();

        if (choice == 1) {
            double mileage = car.getMileage();
            System.out.println("Mileage of the car: " + mileage);
        } else if (choice == 2) {
            double cost = car.getCost();
            System.out.println("Cost of fuel: " + cost);
        } else if (choice == 3) {
            int[] fuelCosts = new int[4];
            for (int i = 0; i < 4; i++) {
                System.out.print("Enter fuel cost for week " +(i+1)+":\n" );
                fuelCosts[i] = scanner.nextInt();
            }
            int maxFuelCost = car.getAverage(fuelCosts);
            System.out.println("Maximum fuel cost: " + maxFuelCost);
        } else {
            System.out.println("Invalid choice. Please enter a valid choice.");
        }

        scanner.close();
    }
}
