package com.network.models;

// назвать класс статичным?
public class Sigmoid  {
    public static double output(double x)
    {
        return x < -45 ? 0 : x > 45 ? 1 : 1.0/(1.0 + Math.exp(-x));
    }
    public static double derivative (double x)
    {
        return x*(1-x);
    }
}
