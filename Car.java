package homework02;

public class Car extends Vehicle {


    private final int fuelCapacity;
    private int currentFuelLevel;


    private boolean flagEngine = false;
    private int speed = 0;

    public Car(int id, String brand, String model, int year, int fuelCapacity) {
        super(id, brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = 0;
    }


    @Override
    void startEngine() {
        if (currentFuelLevel > 0 && !flagEngine) {
            super.startEngine();
            System.out.print(" автомобиля\n");
            flagEngine = true;
        } else if (currentFuelLevel == 0) {
            System.out.println("Нет топлива");
        }
    }

    @Override
    void stopEngine() {
        if (flagEngine) {
            super.stopEngine();
            System.out.print(" автомобиля\n");
            flagEngine = false;
        }
    }

    @Override
    void accelerate(int speed) {
        if (flagEngine) {
            super.accelerate(speed);
            this.speed += speed;
            System.out.printf("Текущая скорость %d\n", speed);
        }
    }

    @Override
    void brake() {
        if (flagEngine) {
            super.brake();
            speed = 0;
        }
    }

    void refuel(int liters) {
        if (fuelCapacity < currentFuelLevel + liters) {
            System.out.printf("Топливный бак заполнен на максимум! %d литров вылилось на землю...\n", (currentFuelLevel + liters - fuelCapacity));
            currentFuelLevel = fuelCapacity;
        } else if (liters > 0) {
            currentFuelLevel += liters;
            System.out.printf("Вы успешно заправили автомобиль на %d литров. Текущий уровень топлива %d\n", liters, currentFuelLevel);
        } else {
            System.out.println("Неккоректное количество топлива");
        }
    }
    @Override
    void displayInfo() {
        System.out.printf("\nID: %d \nМарка автомобиля: %s \nМодель: %s \nГод выпуска: %d \n\nЁмкость топливного бака: %d \nТекущий уровень топлива: %d\n",
                id, brand, model, year, fuelCapacity, currentFuelLevel);
    }
}
