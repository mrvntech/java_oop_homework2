package homework12.controller;

import homework12.model.action.Action;
import homework12.model.vehicle.Car;
import homework12.model.vehicle.Motor;
import homework12.model.vehicle.Truck;
import homework12.model.vehicle.Vehicle;
import homework12.view.VehicleManagementView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class VehicleController {
    private static final HashMap<Integer, Vehicle> vehicles = new HashMap<>();

    public void createVehicle(Vehicle _vehicle) {
        Optional<Vehicle> vehicle = Optional.ofNullable(vehicles.get(_vehicle.getId()));
        if (vehicle.isPresent()) {
            System.out.println("Vehicle already exited");
        } else {
            vehicles.put(_vehicle.getId(), _vehicle);
        }
    }

    public static void removeVehicle(int id) {
        Vehicle vehicle = vehicles.get(id);
        vehicles.remove(id);
    }

    public static List<Vehicle> getVehicleByBrand(String brand) {
        return vehicles.values().stream().filter(vehicle -> vehicle.getBrand().equals(brand)).toList();
    }

    public static List<Vehicle> getVehicleByColor(String color) {
        return vehicles.values().stream().filter(vehicle -> vehicle.getColor().equals(color)).toList();
    }

    public static void run() {
        Action action = VehicleManagementView.getAction();
        boolean isProgramRunning = true;
        while (isProgramRunning) {

            switch (action) {
                case ADD_CAR -> {
                    Car car = VehicleManagementView.getCar();
                    vehicles.put(car.getId(), car);
                }
                case ADD_MOTOR -> {
                    Motor motor = VehicleManagementView.getMotor();
                    vehicles.put(motor.getId(), motor);
                }
                case REMOVE_VEHICLE -> {
                    removeVehicle(VehicleManagementView.getId());
                }
                case ADD_TRUCK -> {
                    Truck truck = VehicleManagementView.getTruck();
                    vehicles.put(truck.getId(), truck);
                }
                case FIND_VEHICLE_BY_BRAND -> {
                    VehicleManagementView.printVehicle(getVehicleByBrand(VehicleManagementView.getBrand()));
                }
                case FIND_VEHICLE_BY_COLOR -> {
                    VehicleManagementView.printVehicle(getVehicleByColor(VehicleManagementView.getColor()));
                }
                default -> {
                    isProgramRunning = false;
                }
            }
        }
    }
}
