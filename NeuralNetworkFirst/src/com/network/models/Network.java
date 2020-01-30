package com.network.models;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.Math;

public class Network {
    //region --Properties--
    public double lernRate;
    public double momentum;
    public List <Neuron> inputLayer;
    //endregion
    //region --Globals--
    private final static Random rnd = new Random();

    //endregion
    //region --Helpers--
    public static double getRandom()
    {
        return 2 * rnd.nextDouble() -1;
    }

    //endregion


}
