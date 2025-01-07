package Day02;
public class App {
    public static void main(String[] args) {
        Vehicle motor = new Vehicle();
        motor.name = "motor";
        motor.brands = "Honda";
        motor.engineType = "2 Cylinder";
        motor.engineCapacity = 250;
        motor.wheels = 2;
        
        motor.start();
        motor.acceleration(100);
        motor.brake();
        motor.brake();
        motor.stop();
        motor.turnOff();
        motor.rev();

        //// -----------------------------------
        Encapsulation test = new Encapsulation();
        test.setBrands("Honda");
        test.setEngineCapacity(20);
        String brand = test.getBrands();
        System.out.println(brand);

        ///-----------------------------------
        Car myCar = new Car();
        myCar.rev();

        Motorbike myBike = new Motorbike();
        myBike.rev();

        Cat kucing = new Cat();
        kucing.move();

        Plant tanaman = new Plant();
        tanaman.move();
    }
}
