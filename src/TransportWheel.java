public abstract class TransportWheel implements Transport {
    private final String nameModel;
    private final int wheelsCount;

    public TransportWheel(String nameModel, int wheelsCount) {
        this.nameModel = nameModel;
        this.wheelsCount = wheelsCount;
    }

    public String getNameModel() {
        return nameModel;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void service() {
        System.out.println("Проверяем " + nameModel);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }

}
