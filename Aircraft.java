package homework02;

public class Aircraft extends Vehicle implements Flyable {

    private final int maxAltitude;
    private boolean isFlying = false;

    private boolean flagEngine = false;

    public Aircraft(int id, String brand, String model, int year, int maxAltitude) {
        super(id, brand, model, year);
        this.maxAltitude = maxAltitude;
    }

    @Override
    void startEngine() {
        if (!flagEngine) {
            super.startEngine();
            System.out.print(" самолёта\n");
            flagEngine = true;
        }
    }

    @Override
    void stopEngine() {
        if (flagEngine) {
            super.stopEngine();
            System.out.print(" самолёта\n");
            flagEngine = false;
        }
    }

    @Override
    public void takeOff() {
        if (flagEngine) {
            System.out.println("Взлет самолета");
            isFlying = true;
        }
    }

    @Override
    public void land() {
        if (isFlying) {
            System.out.println("Посадка самолета");
            isFlying = false;
        }
    }

    @Override
    void displayInfo() {
        System.out.printf("\nID: %d \nМарка автомобиля: %s \nМодель: %s \nГод выпуска: %d \n\nМаксимальная высота полета: %d \nФлаг состояния полета: %b\n",
                id, brand, model, year, maxAltitude, isFlying);
    }
}
