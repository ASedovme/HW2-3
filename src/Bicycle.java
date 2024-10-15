public class Bicycle extends TransportWheel {
    public Bicycle(String nameModel, int wheelsCount) {
        super(nameModel, wheelsCount);
    }

    @Override
    public String toString() {
        return "Bicycle{} " + super.toString();
    }
}