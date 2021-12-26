public class TestFactoryPattern{

    public static void main(String[] args) {

        System.out.println("CAR FACTORY\n");
        System.out.println(CarFactory.buildCar(CarType.SMALL, ManufacturerType.HYUNDAI));
        System.out.println();

        System.out.println(CarFactory.buildCar(CarType.SEDAN, ManufacturerType.SKODA));
        System.out.println();

        System.out.println(CarFactory.buildCar(CarType.LUXURY, ManufacturerType.BMW));
    }
}