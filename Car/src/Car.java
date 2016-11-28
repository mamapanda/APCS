import java.util.Scanner;

public class Car {
    private double fuelEfficiency; //mpg
    private double fuelLevel; //in gallons

    public Car(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
        fuelLevel = 0;
    }

    public double drive(double distance) //miles
    {
        double maxDistance = fuelEfficiency * fuelLevel;
        double driveDistance;
        if ((maxDistance > distance) && (distance >= 0)) {
            fuelLevel -= distance / fuelEfficiency;
            driveDistance = distance;
        } else if (distance < 0) {
            driveDistance = 0;
        } else {
            fuelLevel = 0;
            driveDistance = maxDistance;
        }
        return driveDistance;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void tank(double fuelLoad) {
        if (fuelLoad >= 0) {
            fuelLevel += fuelLoad;
        }
    }

    public static void main(String[] args) {
        Car car;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the fuel efficiency of your car (mpg): ");
        double efficiency = in.nextDouble();
        car = new Car(efficiency);
        while (true) {
            System.out.print("Amount of fuel to load (gallons): ");
            double fuelLoad = in.nextDouble();
            car.tank(fuelLoad);
            System.out.println("Current fuel level (gallons): " + car.getFuelLevel());
            System.out.println();
            while (true) {
                System.out.print("Drive distance (miles): ");
                double driveDistance = in.nextDouble();
                in.nextLine();
                System.out.println("Actual distance driven (miles): " + Math.round(100.0 * car.drive(driveDistance)) / 100.0);
                System.out.println("Fuel left (gallons): " + Math.round(100.0 * car.getFuelLevel()) / 100.0);
                System.out.print("Drive Again? (y/n): ");
                if (!in.nextLine().equalsIgnoreCase("y")) {
                    break;
                }
                System.out.println();
            }
            System.out.print("Load more fuel? (y/n): ");
            if (!in.nextLine().equalsIgnoreCase("y")) {
                break;
            }
            System.out.println();
        }
    }
}