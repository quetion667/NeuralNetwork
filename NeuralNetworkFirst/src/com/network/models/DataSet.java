package com.network.models;

public class DataSet {
    //region --Properties-
    public double [] values;
    public double  [] targets;
    //endregion
    //region --Constructor-
    public DataSet(double [] Values, double [] Targets)
    {
        values = Values;
        targets = Targets;
    }
    //endregion

}
