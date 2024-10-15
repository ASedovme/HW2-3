public class TransportMotor extends TransportWheel{
    public TransportMotor(String nameModel, int wheelsCount) {
        super(nameModel, wheelsCount);
    }
    public void checkEngine(){
        System.out.println("Проверяем Двигатель");
    }
    @Override
    public void service(){
        super.service();
        checkEngine();
    }
}
