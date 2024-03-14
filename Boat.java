package homework02;

public class Boat extends Vehicle implements Swimmable {
    private final int maxSpeed;
    private boolean isSailing;

    private boolean flagEngine = false;

    public Boat(int id, String brand, String model, int year, int maxSpeed) {
        super(id, brand, model, year);
        this.maxSpeed = maxSpeed;
    }

    @Override
    void startEngine() {
        if (!flagEngine) {
            super.startEngine();
            System.out.print(" лодки\n");
            flagEngine = true;
        }
    }

    @Override
    void stopEngine() {
        if (flagEngine) {
            super.stopEngine();
            System.out.print(" лодки\n");
            flagEngine = false;
        }
    }

    @Override
    public void startSwimming() {
        if (flagEngine) {
            System.out.println("Начало движения лодки по воде");
            isSailing = true;
        }
    }

    @Override
    public void stopSwimming() {
        if (isSailing) {
            System.out.println("Прекращение движения лодки по воде");
            isSailing = false;
        }
    }

    @Override
    void displayInfo() {
        System.out.printf("\nID: %d \nМарка автомобиля: %s \nМодель: %s \nГод выпуска: %d \n\nМаксимальная скорость на воде: %d \nфлаг состояния движения по воде: %b\n",
                id, brand, model, year, maxSpeed, isSailing);
    }
}
