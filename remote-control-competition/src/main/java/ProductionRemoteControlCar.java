class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private final int SPEED = 10;
    private int distanceTravelled;
    private int numberOfVictories;

    @Override
    public void drive() {
        distanceTravelled += SPEED;
    }

    @Override
    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar that) {
        return this.numberOfVictories - that.getNumberOfVictories();
    }
}
