// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating instances of Manufacture
        Manufacture toyota = new Manufacture("Marcedes", "Germany");
        Manufacture tesla = new Manufacture("Tesla", "USA");
        Manufacture ford = new Manufacture("Lamborghini", "USA");

        // Creating an array of Vehicle objects
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new ICEV(toyota, "Marcedes", "Benz", 2010, "White", 15000, "AB123CD"));
        vehicles.add(new BEV(tesla, "Tesla", "Model S", 2020, "Red", 80000, "EF456GH"));
        vehicles.add(new HybridV(ford, "Lamborghini", "Gallerdo", 2015, "Blue", 25000, "IJ789KL"));

        // Demonstrating the ShowCharacteristics method for each vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.ShowCharacteristics();
        }
    }
}
