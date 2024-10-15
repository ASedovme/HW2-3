public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("CAR1", 4);
        Car car2 = new Car("CAR2", 4);
        Bicycle bicycle1 = new Bicycle("BICIKL1", 2);
        Bicycle bicycle2 = new Bicycle("BICIKL2", 2);
        Truck truck1 = new Truck("TRACK1", 6);
        Truck truck2 = new Truck("TRACK2", 8);

        Transport[] transports = {
                car1,
                car2,
                bicycle1,
                bicycle2,
                truck1,
                truck2
        };
        ServiceStation station = new ServiceStation();
        for (Transport transport : transports){
            station.check(transport);
        }

    }
}