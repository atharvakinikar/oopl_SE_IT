public class LuxuryCar extends Car{
    LuxuryCar(){
        super(CarType.LUXURY, ManufacturerType.BMW);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building the Luxury car");
        System.out.println("Model Name : BMW 520d");
    }
}