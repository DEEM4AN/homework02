package homework02;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(001, "Mersedes", "w124", 1995, 65);
        car.displayInfo();
        car.startEngine();
        car.startEngine();
        car.refuel(22);
        car.refuel(2222);
        car.startEngine();
        car.startEngine();
        car.accelerate(22);
        car.displayInfo();
        car.stopEngine();
        car.stopEngine();
        car.stopEngine();

        Aircraft aircraft = new Aircraft(12, "Boeing", "76", 2000, 321);
        aircraft.displayInfo();
        aircraft.stopEngine();
        aircraft.land();
        aircraft.takeOff();
        aircraft.startEngine();
        aircraft.takeOff();
        aircraft.land();
        aircraft.stopEngine();



        Boat boat = new Boat(12, "SSS", "111", 1999, 22);
        boat.displayInfo();
        boat.startEngine();
        boat.stopEngine();
        boat.startSwimming();

        boat.startEngine();
        boat.startSwimming();
        boat.brake();
        boat.stopSwimming();
    }
}
