package homework12.controller;

import homework12.model.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class VehicleController {
    private final HashMap<Integer, Vehicle> vehicles = new HashMap<>();
    private final HashMap<String, ArrayList<Vehicle>> brandVehicles = new HashMap<>();
    private final HashMap<String, ArrayList<Vehicle>> colorVehicles = new HashMap<>();

    public void createVehicle(Vehicle _vehicle) {
        Optional<Vehicle> vehicle = Optional.ofNullable(vehicles.get(_vehicle.getId()));
        if (vehicle.isPresent()) {
            System.out.println("Vehicle already exited");
        } else {
            vehicles.put(_vehicle.getId(), _vehicle);
        }

        Optional<ArrayList<Vehicle>> brandVehicles = Optional.ofNullable(this.brandVehicles.get(_vehicle.getBrand()));
        if (brandVehicles.isPresent()) {
            brandVehicles.get().add(_vehicle);
        } else {
            this.brandVehicles.put(_vehicle.getBrand(), new ArrayList<>(List.of(_vehicle)));
        }

        Optional<ArrayList<Vehicle>> colorVehicles = Optional.ofNullable(this.colorVehicles.get(_vehicle.getColor()));
        if (colorVehicles.isPresent()) {
            colorVehicles.get().add(_vehicle);
        } else {
            this.colorVehicles.put(_vehicle.getColor(), new ArrayList<>(List.of(_vehicle)));
        }
    }

    public void removeVehicle(int id) {
        Vehicle vehicle = vehicles.get(id);
        vehicles.remove(id);
        colorVehicles.remove(vehicle.getColor());
        brandVehicles.remove(vehicle.getBrand());
    }

    public Optional<ArrayList<Vehicle>> getVehicleByBrand(String brand) {
        return Optional.ofNullable(brandVehicles.get(brand));
    }

    public Optional<ArrayList<Vehicle>> getVehicleByColor(String color) {
        return Optional.ofNullable(colorVehicles.get(color));
    }
}
