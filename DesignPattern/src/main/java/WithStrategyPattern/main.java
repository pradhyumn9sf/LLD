package WithStrategyPattern;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new PassengerVehicle());
        vehicles.add(new OffRoadVehicle());
        vehicles.add(new SportsVehicle());
        for(Vehicle vehicle : vehicles){
            vehicle.drive();
        }
    }
}
