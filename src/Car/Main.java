package Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 2022, 20000);

        System.out.println("Модель машины: " + car.getName() + "\nГод выпуска: " + car.getYear() + "\nПробег (в км): " + car.getTimeRun());
    }
}
