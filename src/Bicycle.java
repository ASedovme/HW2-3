public class Bicycle extends Trasport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String getModelName() {
        return super.getModelName();
    }

    @Override
    public int getWheelsCount() {
        return super.getWheelsCount();
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}