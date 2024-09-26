// Vehicle.java
import java.util.UUID;

abstract class Vehicle {
    protected Manufacture manufacture;
    protected Engine engine;
    
    // Attributes from Hometask2
    protected String id;
    protected String make;
    protected String model;
    protected int yearOfManufacture;
    protected String color;
    protected double price;
    protected String registrationNumber;

    public Vehicle(Manufacture manufacture, Engine engine, String make, String model, int yearOfManufacture,
                   String color, double price, String registrationNumber) {
        this.manufacture = manufacture;
        this.engine = engine;
        this.id = UUID.randomUUID().toString();
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public abstract void ShowCharacteristics();

    @Override
    public String toString() {
        return String.format("ID: %s, Make: %s, Model: %s, Year: %d, Color: %s, Price: %.2f, Registration Number: %s, Manufacturer: %s",
                id, make, model, yearOfManufacture, color, price, registrationNumber, manufacture);
    }
}
