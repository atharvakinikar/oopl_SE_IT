public class SedanCar extends Car{
    SedanCar(){
        super(CarType.SEDAN, ManufacturerType.SKODA);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building the Sedan");
        System.out.println("Model Name : Skoda Octavia");
    }
}