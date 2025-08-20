abstract public class Vehicle {
    String model;
    int year;

    abstract void start();
    abstract void stop();

    public void displayInfo()
    {
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
    }

}
