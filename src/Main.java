public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[]{
            new Car("car1", 4),
            new Car("car2", 4),

            new Truck("truck1", 6),
            new Truck("truck2", 8),

            new Bicycle("bicycle1", 2),
            new Bicycle("bicycle2", 2),
        };

        ServiceStation station = new ServiceStation();
        for (Vehicle vehicle: vehicles) {
            System.out.println("Результат диагностики " + vehicle.getModelName() + ":");
            station.check(vehicle);
            System.out.println();
        }
    }
}