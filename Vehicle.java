package homework02;

public abstract class Vehicle {
    protected final int id;
    protected final String brand;
    protected final String model;
    protected final int year;

    public Vehicle(int id, String brand, String model, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }


    void startEngine() {
        System.out.print("Запуск двигателя");
    }

    void stopEngine() {
        System.out.print("Остановка двигател");
    }

    void accelerate(int speed) {
        System.out.println("Увеличение скорости на " + speed + " км/ч");
    }

    void brake() {
        System.out.println("Прекращение движения");
    }

    abstract void displayInfo();
}

