package src.Vehicels;

/**
 * Created by markuslyconhold on 09/10/16.
 */
public class Bike extends Vehicle{

    public Bike(int pass){
        placeLimit = 1;

        //the cost is only 4 since the passenger is included and there is only place for 1 passenger.
        cost = 40;
    }
}
