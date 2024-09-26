// BEV.java
public class BEV extends Vehicle {
    public BEV(Manufacture manufacture, String make, String model, int yearOfManufacture,
               String color, double price, String registrationNumber) {
        super(manufacture, new ElectricEngine(), make, model, yearOfManufacture, color, price, registrationNumber);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: BEV, Engine Type: " + engine.getEngineType() + ", Details: " + this.toString());
    }
}
