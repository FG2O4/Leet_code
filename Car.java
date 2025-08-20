public class Car extends Vehicle implements Upgradeable {
    
    private String engineType;

    public Car(String model, int year, String engineType)
    {
        this.model = model;
        this.year = year;
        this.engineType = engineType;
    }

    @Override
    public void start()
    {
        System.out.println("Автомобиль завелся.");
    }
    
    @Override
    public void stop()
    {
        System.out.println("Автомобиль остановился.");
    }

    @Override
    public void upgradeEngine(String newEngine)
    {
        this.engineType = newEngine;
    }
    @Override
    public void addFeature(String feature )
    {
        System.out.println("Добавлена новая функция: " + feature);
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип двигателя: " + engineType);
    }

}
