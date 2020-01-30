package com.network.models;
import java.util.UUID;

public class Synapse {
    //region Properties
    public UUID id;
    public Neuron inputNeuron;
    public Neuron outputNeuron;
    public double weight;
    public double weightDelta;
    //endregion

    //region Constructor
    Synapse()
    {

    }
    Synapse(Neuron InputNeuron, Neuron OutputNeuron)
    {
        id = UUID.randomUUID();
        inputNeuron = InputNeuron;
        outputNeuron = OutputNeuron;
        weight = Network.getRandom();
    }
    //endregion
}
