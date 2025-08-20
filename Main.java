public class Main {
     public static void main(String[] args) {
        
        Car car = new Car("BMW", 2018,"V6" );
        car.displayInfo();
        car.addFeature("Ручной тормаз");
        car.start();

        car.stop();
        System.out.println("Купил новый двигатель");
        car.upgradeEngine("V8");
        car.displayInfo();


        Bicycle bike = new Bicycle("Два колеса и две педали", 2020);

        bike.start();
        bike.stop();
    }

}
