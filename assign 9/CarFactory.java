/*
Name:-Atharva Kinikar
Div :- SE10
Batch :- F10
Roll No :23241
*/

public class CarFactory {
    public static Car buildCar(CarType model, ManufacturerType manufacturer) {

        Car car = null;

        switch (model) {
            case SMALL:
                car = new SmallCar();
                break;
            case SEDAN:
                car = new SedanCar();
                break;
            case LUXURY:
                car = new LuxuryCar();
                break;
            default:
                System.out.println("Invalid Choice !!!");
                break;
        }
        return car;
    }
}