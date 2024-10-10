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

    public void check() {
        System.out.println("проверяем велик " + modelName);
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}