/*
Name:-Atharva Kinikar
Div :- SE10
Batch :- F10
Roll No :23241
*/

public abstract class Car {

    public Car(CarType model, ManufacturerType manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
        arrangeParts();
    }

    private void arrangeParts() {
        System.out.println("Car Manufacturing Started");
    }

    protected abstract void construct();

    private CarType model = null;
    private ManufacturerType manufacturer = null;

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    public ManufacturerType getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(ManufacturerType manufacturer) {
        this.manufacturer = manufacturer;
    }
}