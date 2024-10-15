public class Truck extends TransportMotor {
    public Truck(String nameModel, int wheelsCount) {
        super(nameModel, wheelsCount);
    }
    public void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void service(){
        super.service();
        checkTrailer();
    }
}