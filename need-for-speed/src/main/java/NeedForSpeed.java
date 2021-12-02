class NeedForSpeed {
	
	int speed, batteryDrain;
	int battery = 100;
	int distance = 0;
	
	public NeedForSpeed(int speed, int batteryDrain) {
		this.speed = speed;
		this.batteryDrain = batteryDrain;
	
	}
    public boolean batteryDrained() {
    	return (battery > 0) ? false : true;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
    	if(this.battery >= batteryDrain ) {
    		this.distance += this.speed;
    		this.battery -= batteryDrain;
    	}
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    int distance;
    
	public RaceTrack(int distance) {
		this.distance = distance;
	}
    public boolean carCanFinish(NeedForSpeed car) {
       int distance = car.battery / car.batteryDrain * car.speed;
       return distance >= this.distance;
    }
}
