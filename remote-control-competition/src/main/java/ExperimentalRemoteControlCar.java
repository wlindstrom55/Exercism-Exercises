public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private final int SPEED = 20;
    private int distanceTravelled;
    
    @Override
    public void drive() {
        distanceTravelled += SPEED;
    }
    
    @Override
    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}
