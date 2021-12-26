public class SmallCar extends Car{
    SmallCar(){
        super(CarType.SMALL, ManufacturerType.HYUNDAI);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building Small Car ");
        System.out.println("Model Name : Hyundai i20");
    }
}