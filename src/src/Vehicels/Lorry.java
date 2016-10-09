package src.Vehicels;

/**
 * Created by markuslyconhold on 09/10/16.
 */
public class Lorry extends Vehicle{
    public Lorry(int pass){
        placeLimit = 4;
        cost = 15*pass + 300;
    }
}
