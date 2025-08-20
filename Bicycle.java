public class Bicycle extends Vehicle{
    
    public Bicycle(String model, int year)
    {
        this.model = model;
        this.year = year;
    }

    @Override 
    public void start()
    {
        System.out.println("Велосипед начал движение");
    }
     @Override 
    public void stop()
    {
        System.out.println("Велосипед закончил движение");
    }
}
