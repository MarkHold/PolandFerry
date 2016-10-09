package src.Vehicels;

/**
 * Created by markuslyconhold on 09/10/16.
 */
public class Buss extends Vehicle{

    public Buss(int pass){
        placeLimit = 20;
        cost = 10*pass + 200;
    }
}
