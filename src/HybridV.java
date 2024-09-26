// HybridV.java
public class HybridV extends Vehicle {
    public HybridV(Manufacture manufacture, String make, String model, int yearOfManufacture,
                   String color, double price, String registrationNumber) {
        super(manufacture, new HybridEngine(), make, model, yearOfManufacture, color, price, registrationNumber);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: HybridV, Engine Type: " + engine.getEngineType() + ", Details: " + this.toString());
    }
}
