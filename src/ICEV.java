// ICEV.java
public class ICEV extends Vehicle {
    public ICEV(Manufacture manufacture, String make, String model, int yearOfManufacture,
                String color, double price, String registrationNumber) {
        super(manufacture, new CombustionEngine(), make, model, yearOfManufacture, color, price, registrationNumber);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: ICEV, Engine Type: " + engine.getEngineType() + ", Details: " + this.toString());
    }
}
