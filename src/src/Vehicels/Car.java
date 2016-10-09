package src.Vehicels;

/**
 * Created by markuslyconhold on 09/10/16.
 */
public class Car extends Vehicle{

    public Car(int pass){
        placeLimit = 4;
        cost = 15*pass + 100;
    }
}
