public class Truck extends Trasport{


    public int getWheelsCount;

    public Truck(String modelName, int wheelsCount) {
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


    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}