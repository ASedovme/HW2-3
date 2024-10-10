public class Trasport {
    String modelName;
    private int wheelsCount;

    public Trasport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");

    }

    public String getModelName() {
        return modelName;
    }


    public int getWheelsCount() {
        return wheelsCount;
    }


}
