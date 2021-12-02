import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTrack {

    public void race(RemoteControlCar car) {
    	//this method uses the interface RCC as a param, so all we need to do is basically call the RCC drive() to cause the interface to start the race between our separate car objects (?)
    	car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
    	List<ProductionRemoteControlCar> rankings = new ArrayList<ProductionRemoteControlCar>();
        rankings.add(prc2);
        rankings.add(prc1);
        Collections.sort(rankings);
        return rankings;
    }
}
